package spreadsheet;

/**
 * An extension of the SparseSpreadSheet that adds the ability to execute
 * macro commands. This allows the spreadsheet to perform complex operations
 * as macros, enhancing its capabilities beyond simple cell operations.
 */
public class MacroRangeAssign implements MacroCommand {
  private final int fromRow;
  private final int fromCol;
  private final int toRow;
  private final int toCol;
  private final double startValue;
  private final double increment;

  /**
   * Constructs a new RangeAssignMacro instance with the specified range,
   * start value, and increment.
   *
   * @param fromRow    the row index of the starting cell in the range to be assigned values
   * @param fromCol    the column index of the starting cell in the range to be assigned values
   * @param toRow      the row index of the ending cell in the range to be assigned values
   * @param toCol      the column index of the ending cell in the range to be assigned values
   * @param startValue the starting value to be assigned to the first cell in the range
   * @param increment  the increment to be added to the value of each subsequent cell in the range
   * @throws IllegalArgumentException if any of the input values are negative
   */
  public MacroRangeAssign(int fromRow, int fromCol, int toRow, int toCol, double startValue,
                          double increment) throws IllegalArgumentException {
    if (fromRow < 0 || fromCol < 0 || toRow < 0 || toCol < 0) {
      throw new IllegalArgumentException("Invalid input!");
    }
    this.fromRow = fromRow;
    this.fromCol = fromCol;
    this.toRow = toRow;
    this.toCol = toCol;
    this.startValue = startValue;
    this.increment = increment;
  }

  /**
   * Execute the macro on the given spreadsheet.
   *
   * @param spreadSheet the spreadsheet on which to execute the macro
   */
  @Override
  public void execute(SpreadSheet spreadSheet) {
    double currentValue = startValue;
    for (int i = fromRow; i <= toRow; i++) {
      for (int j = fromCol; j <= toCol; j++) {
        spreadSheet.set(i, j, currentValue);
        currentValue += increment;
      }
    }
  }
}
