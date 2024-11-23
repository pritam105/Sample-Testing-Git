package spreadsheet;

/**
 * Represents a command that sets the value of a specific cell in a spreadsheet.
 */
public class Macro implements MacroCommand {
  private final int row;
  private final int col;
  private final double value;

  /**
   * Constructs a new `Macro` instance with the specified cell coordinates
   * and the value to be assigned.
   *
   * @param row   the row index of the cell to be modified
   * @param col   the column index of the cell to be modified
   * @param value the new value to be assigned to the cell
   * @throws IllegalArgumentException if either the row index or column
   *                                  index is negative
   */
  public Macro(int row, int col, double value) {
    if (row < 0 || col < 0) {
      throw new IllegalArgumentException("Enter valid row and col");
    }

    this.row = row;
    this.col = col;
    this.value = value;
  }

  /**
   * Execute the macro on the given spreadsheet.
   *
   * @param spreadSheet the spreadsheet on which to execute the macro
   */
  @Override
  public void execute(SpreadSheet spreadSheet) {
    spreadSheet.set(this.row, this.col, this.value);
  }
}
