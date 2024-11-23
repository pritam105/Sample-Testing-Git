import org.junit.Before;
import org.junit.Test;

import spreadsheet.MacroAverage;
import spreadsheet.MacroSpreadSheet;
import spreadsheet.NewSparseSpreadSheet;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the MacroAverage class on a sparse spreadsheet.
 * It checks the correctness of average calculation over a range of cells.
 */
public class MacroAverageTest {

  private MacroSpreadSheet spreadSheet;

  /**
   * Initializes a spreadsheet and populates it with test data before each test.
   */
  @Before
  public void setUp() {
    spreadSheet = new NewSparseSpreadSheet();
    spreadSheet.set(0, 0, 1);
    spreadSheet.set(0, 1, 2);
    spreadSheet.set(1, 0, 3);
    spreadSheet.set(1, 1, 4);
  }

  /**
   * Tests the average value calculation over a range of cells.
   */
  @Test
  public void testAverageCalculation() {
    MacroAverage macro = new
            MacroAverage(0, 0, 1, 1, 2, 2);
    macro.execute(spreadSheet);
    assertEquals(2.5, spreadSheet.get(2, 2), 0.01);
  }

  /**
   * Tests illegal arguments are handled by throwing IllegalArgumentException.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidArguments() {
    new MacroAverage(-1, 0, 1, 1, 2, 2);
  }

  /**
   * Tests that the average of a single cell is calculated correctly.
   */
  @Test
  public void testAverageOfSingleCell() {
    MacroAverage macro = new
            MacroAverage(0, 0, 0, 0, 2, 2);
    macro.execute(spreadSheet);
    assertEquals(1.0, spreadSheet.get(2, 2), 0.01);
  }

  /**
   * Tests that the average of a range with no cells is zero.
   */
  @Test
  public void testNoCellsInRange() {
    MacroAverage macro = new
            MacroAverage(2, 2, 2, 2, 2, 2);
    macro.execute(spreadSheet);
    assertEquals(0.0, spreadSheet.get(2, 2), 0.01);
  }

  /**
   * Tests the average calculation when the range includes cells with zero values.
   */
  @Test
  public void testAverageWithZeros() {
    spreadSheet.set(2, 0, 0);
    spreadSheet.set(2, 1, 0);
    MacroAverage macro = new
            MacroAverage(0, 0, 2, 1, 3, 3);
    macro.execute(spreadSheet);
    assertEquals(1.666, spreadSheet.get(3, 3), 0.01);
  }

  /**
   * Tests the average calculation when the destination cell is within the range.
   */
  @Test
  public void testAverageInSameRange() {
    MacroAverage macro = new
            MacroAverage(0, 0, 1, 1, 0, 0);
    macro.execute(spreadSheet);
    assertEquals(2.5, spreadSheet.get(0, 0), 0.01);
  }
}
