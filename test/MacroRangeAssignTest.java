import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import spreadsheet.MacroRangeAssign;
import spreadsheet.MacroSpreadSheet;
import spreadsheet.NewSparseSpreadSheet;

/**
 * This class contains several test cases that validate the behavior of
 * the MacroRangeAssign when applied to a NewSparseSpreadSheet.
 */
public class MacroRangeAssignTest {

  private MacroSpreadSheet spreadSheet;

  /**
   * Sets up a new sparse spreadsheet instance before each test case.
   */
  @Before
  public void setUp() {
    spreadSheet = new NewSparseSpreadSheet();
  }

  /**
   * Tests that the MacroRangeAssign correctly assigns an incremental series
   * of values to a range of cells in the spreadsheet.
   */
  @Test
  public void testIncrementalAssignment() {
    MacroRangeAssign macro = new
            MacroRangeAssign(0, 0, 1, 1, 1.0, 1.0);
    macro.execute(spreadSheet);
    Assert.assertEquals(1.0, spreadSheet.get(0, 0), 0.01);
    Assert.assertEquals(2.0, spreadSheet.get(0, 1), 0.01);
    Assert.assertEquals(3.0, spreadSheet.get(1, 0), 0.01);
    Assert.assertEquals(4.0, spreadSheet.get(1, 1), 0.01);
  }

  /**
   * Test for negative indices.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testNegativeIndices() {
    new MacroRangeAssign(-1, 0, 1, 1, 1.0, 1.0);
  }

  /**
   * Test for Single Cell Assignment.
   */
  @Test
  public void testSingleCellAssignment() {
    MacroRangeAssign macro = new
            MacroRangeAssign(0, 0, 0, 0, 5.0, 2.0);
    macro.execute(spreadSheet);
    Assert.assertEquals(5.0, spreadSheet.get(0, 0), 0.01);
  }

  /**
   * Test for no increment.
   */
  @Test
  public void testNoIncrement() {
    MacroRangeAssign macro = new
            MacroRangeAssign(0, 0, 1, 1, 10.0, 0.0);
    macro.execute(spreadSheet);
    for (int i = 0; i <= 1; i++) {
      for (int j = 0; j <= 1; j++) {
        Assert.assertEquals(10.0, spreadSheet.get(i, j), 0.01);
      }
    }
  }

  /**
   * Test for negative increment.
   */
  @Test
  public void testNegativeIncrement() {
    MacroRangeAssign macro = new
            MacroRangeAssign(0, 0, 1, 1,
            10.0, -1.0);
    macro.execute(spreadSheet);
    Assert.assertEquals(10.0, spreadSheet.get(0, 0), 0.01);
    Assert.assertEquals(9.0, spreadSheet.get(0, 1), 0.01);
    Assert.assertEquals(8.0, spreadSheet.get(1, 0), 0.01);
    Assert.assertEquals(7.0, spreadSheet.get(1, 1), 0.01);
  }

  /**
   * Test for decimal increment.
   */
  @Test
  public void testDecimalIncrement() {
    MacroRangeAssign macro = new
            MacroRangeAssign(0, 0, 1, 1, 0.0, 0.5);
    macro.execute(spreadSheet);
    Assert.assertEquals(0.0, spreadSheet.get(0, 0), 0.01);
    Assert.assertEquals(0.5, spreadSheet.get(0, 1), 0.01);
    Assert.assertEquals(1.0, spreadSheet.get(1, 0), 0.01);
    Assert.assertEquals(1.5, spreadSheet.get(1, 1), 0.01);
  }
}
