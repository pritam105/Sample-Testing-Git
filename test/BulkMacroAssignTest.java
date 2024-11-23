import org.junit.Before;
import org.junit.Test;

import spreadsheet.BulkMacroAssign;
import spreadsheet.MacroSpreadSheet;
import spreadsheet.NewSparseSpreadSheet;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the BulkMacroAssign class to ensure it assigns values
 * correctly in a spreadsheet environment.
 */
public class BulkMacroAssignTest {

  private MacroSpreadSheet spreadSheet;

  /**
   * setup for test, initializing the object.
   */
  @Before
  public void setup() {
    spreadSheet = new NewSparseSpreadSheet();
  }

  /**
   * Tests the assignment of a single value to a single cell to verify
   * that the macro correctly updates the cell's value.
   */
  @Test
  public void testSingleCellAssignment() {
    BulkMacroAssign macro = new BulkMacroAssign(1, 1, 1, 1, 5.0);
    macro.execute(spreadSheet);
    assertEquals(5.0, spreadSheet.get(1, 1), 0.01);
  }

  /**
   * Tests the assignment of a single value to a range of cells to ensure
   * that the macro uniformly updates all cells in the specified range.
   */
  @Test
  public void testRangeAssignment() {
    BulkMacroAssign macro = new BulkMacroAssign(1, 1, 2, 2, 10.0);
    macro.execute(spreadSheet);
    for (int row = 1; row <= 2; row++) {
      for (int col = 1; col <= 2; col++) {
        assertEquals(10.0, spreadSheet.get(row, col), 0.01);
      }
    }
  }

  /**
   * Tests that the constructor of BulkMacroAssign throws an exception
   * when passed a negative starting row index.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidRowIndices() {
    new BulkMacroAssign(-1, 1, 1, 1, 5.0);
  }

  /**
   * Tests that the constructor of BulkMacroAssign throws an exception
   * when passed a negative starting column index.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidColIndices() {
    new BulkMacroAssign(1, -1, 1, 1, 5.0);
  }

  /**
   * Tests that the constructor of BulkMacroAssign throws an exception
   * when the ending indices are less than the starting indices.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidRange() {
    new BulkMacroAssign(2, 2, 1, 1, 5.0);
  }

  /**
   * Tests the assignment of a specific value to a single cell to confirm
   * that the macro executes correctly when the range covers only one cell.
   */
  @Test
  public void testValueAssignment() {
    double value = 3.5;
    BulkMacroAssign macro = new BulkMacroAssign(0, 0, 0, 0, value);
    macro.execute(spreadSheet);
    assertEquals(value, spreadSheet.get(0, 0), 0.01);
  }
}
