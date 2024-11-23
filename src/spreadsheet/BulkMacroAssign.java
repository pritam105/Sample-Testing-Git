package spreadsheet;

/**
 * A macro command that assigns a specified value to a range of cells within a spreadsheet.
 */
public class BulkMacroAssign implements MacroCommand {
  private final int fromRow;
  private final int fromCol;
  private final int toRow;
  private final int toCol;
  private final double value;

  /**
   * Constructs a BulkMacroAssign command with the specified starting and
   * ending cell range and the value to assign.
   *
   * @param fromRow the starting row index of the cell range
   * @param fromCol the starting column index of the cell range
   * @param toRow   the ending row index of the cell range
   * @param toCol   the ending column index of the cell range
   * @param value   the value to assign to all cells in the range
   * @throws IllegalArgumentException if any of the indices are negative
   */
  public BulkMacroAssign(int fromRow, int fromCol, int toRow, int toCol, double value) {
    if (fromRow < 0 || fromCol < 0 || toRow < fromRow || toCol < fromCol) {
      throw new IllegalArgumentException("Invalid cell range");
    }
    this.fromRow = fromRow;
    this.fromCol = fromCol;
    this.toRow = toRow;
    this.toCol = toCol;
    this.value = value;
  }

  /**
   * Executes this macro command on the given spreadsheet.
   *
   * @param spreadSheet the spreadsheet on which to execute the macro
   */
  @Override
  public void execute(SpreadSheet spreadSheet) {
    for (int row = fromRow; row <= toRow; row++) {
      for (int col = fromCol; col <= toCol; col++) {
        spreadSheet.set(row, col, value);
      }
    }
  }
}
