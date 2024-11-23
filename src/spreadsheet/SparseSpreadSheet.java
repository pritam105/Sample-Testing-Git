package spreadsheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class represents a sparse spreadsheet. A sparse spreadsheet is a spreadsheet
 * with a large number of empty cells. It represents this efficiently using a hash map.
 */
public class SparseSpreadSheet implements SpreadSheet {
  private final Map<CellPosition, Double> sheet;
  private int width;
  private int height;

  /**
   * Create an empty spreadsheet.
   */
  public SparseSpreadSheet() {
    this.sheet = new HashMap<CellPosition, Double>();
    this.width = 0;
    this.height = 0;
  }

  /**
   * Get the number at the specified cell.
   *
   * @param row the row number of the cell, starting with 0
   * @param col the column number of the cell, starting with 0
   * @return the number at the specified cell, as a double. If the cell is empty, it returns a 0
   * @throws IllegalArgumentException if the row or column are negative
   */
  @Override
  public double get(int row, int col) throws IllegalArgumentException {
    if ((row < 0) || (col < 0)) {
      throw new IllegalArgumentException("Row or column cannot be negative");
    }
    return this.sheet.getOrDefault(new CellPosition(row, col), 0.0);
  }

  /**
   * Set the value of the specified cell to the specified value.
   *
   * @param row   the row number of the cell, starting with 0
   * @param col   the column number of the cell, starting at 0
   * @param value the value that this cell must be set to
   * @throws IllegalArgumentException if the row or column are negative
   */
  @Override
  public void set(int row, int col, double value) throws IllegalArgumentException {
    if ((row < 0) || (col < 0)) {
      throw new IllegalArgumentException("Row or column cannot be negative");
    }
    this.sheet.put(new CellPosition(row, col), value);
    if ((row + 1) > height) {
      height = row + 1;
    }

    if ((col + 1) > width) {
      width = col + 1;
    }
  }

  /**
   * Returns whether the specified cell is empty.
   *
   * @param row the row number of the cell, starting with 0
   * @param col the column number of the cell, starting with 0
   * @return true if the cell is empty, false otherwise
   * @throws IllegalArgumentException if the row or column are negative
   */
  @Override
  public boolean isEmpty(int row, int col) throws IllegalArgumentException {
    if ((row < 0) || (col < 0)) {
      throw new IllegalArgumentException("Row or column cannot be negative");
    }
    return !this.sheet.containsKey(new CellPosition(row, col));
  }

  /**
   * Return the width of this spreadsheet. The width is defined by the cell with
   * the highest column number that is not empty.
   *
   * @return the width of this spreadsheet
   */
  @Override
  public int getWidth() {
    return this.width;
  }

  /**
   * Return the height of this spreadsheet. The height is defined by the cell with
   * the highest row number that is not empty.
   *
   * @return the height of this spreadsheet
   */
  @Override
  public int getHeight() {
    return this.height;
  }

  /**
   * Represents a specific position in a spreadsheet, defined by its row and column indices.
   */
  private static class CellPosition {
    private final int row;
    private final int column;

    /**
     * Constructs a CellPosition with the specified row and column indices.
     *
     * @param row    the zero-based index of the row
     * @param column the zero-based index of the column
     */
    private CellPosition(int row, int column) {
      this.row = row;
      this.column = column;
    }

    /**
     * Compares this CellPosition with another object for equality.
     * Two CellPositions are considered equal if they have the same row and column indices.
     *
     * @param o the object to be compared for equality with this CellPosition
     * @return true if the specified object is equal to this CellPosition, false otherwise
     */
    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof CellPosition)) {
        return false;
      }
      CellPosition other = (CellPosition) o;
      return this.row == other.row && this.column == other.column;
    }

    /**
     * Computes the hash code for this CellPosition.
     * The hash code is computed using the row and column indices of this CellPosition.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
      return Objects.hash(this.row, this.column);
    }
  }
}
