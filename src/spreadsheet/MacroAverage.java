package spreadsheet;

/**
 * A macro command for computing the average of values within a specified range in a spreadsheet
 * and setting the result in a designated cell.
 */
public class MacroAverage implements MacroCommand {
  private final int fromRow;
  private final int fromCol;
  private final int toRow;
  private final int toCol;
  private final int destRow;
  private final int destCol;

  /**
   * Constructs a macro for calculating the average value of a cell range
   * and placing the result in a specified cell.
   *
   * @param fromRow  The start row index for the averaging range.
   * @param fromCol  The start column index for the averaging range.
   * @param toRow    The end row index for the averaging range.
   * @param toCol    The end column index for the averaging range.
   * @param destRow  The row index of the cell to receive the average result.
   * @param destCol  The column index of the cell to receive the average result.
   * @throws IllegalArgumentException if any parameter is negative.
   */
  public MacroAverage(int fromRow, int fromCol, int toRow, int toCol, int destRow, int destCol)
          throws IllegalArgumentException {
    if (fromRow < 0 || fromCol < 0 || toRow < 0 || toCol < 0 || destRow < 0 || destCol < 0) {
      throw new IllegalArgumentException("Invalid input!");
    }
    this.fromRow = fromRow;
    this.fromCol = fromCol;
    this.toRow = toRow;
    this.toCol = toCol;
    this.destRow = destRow;
    this.destCol = destCol;
  }

  /**
   * Executes this macro command on the given spreadsheet.
   *
   * @param spreadSheet the spreadsheet on which to execute the macro
   */
  @Override
  public void execute(SpreadSheet spreadSheet) {
    double sum = 0;
    int count = 0;
    for (int i = fromRow; i <= toRow; i++) {
      for (int j = fromCol; j <= toCol; j++) {
        sum += spreadSheet.get(i, j);
        count++;
      }
    }
    double average = count > 0 ? sum / count : 0;
    spreadSheet.set(destRow, destCol, average);
  }
}
