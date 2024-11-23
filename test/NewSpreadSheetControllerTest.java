import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import spreadsheet.NewSpreadSheetController;
import spreadsheet.NewSparseSpreadSheet;
import spreadsheet.MacroSpreadSheet;

import static org.junit.Assert.assertEquals;


/**
 * This class tests the functionality of the EnhancedSpreadSheetController.
 */
public class NewSpreadSheetControllerTest {

  private MacroSpreadSheet spreadSheet;

  private StringBuilder output;

  /**
   * Sets up the environment before each test..
   */
  @Before
  public void setUp() {
    spreadSheet = new NewSparseSpreadSheet();
    output = new StringBuilder();
  }

  /**
   * Helper method to execute the controller with given input.
   *
   * @param input The string input simulating user commands for the controller.
   */
  private void executeControllerWithInput(String input) {
    NewSpreadSheetController controller;
    controller = new NewSpreadSheetController(spreadSheet, new StringReader(input), output);
    controller.control();
  }

  /**
   * Tests the bulk-assign-value command.
   */
  @Test
  public void testBulkAssign() {
    String input = "bulk-assign-value A 1 A 10 1\nq\n";
    executeControllerWithInput(input);
    for (int i = 0; i < 10; i++) {
      assertEquals(1.0, spreadSheet.get(0, i), 0.001);
    }
  }

  /**
   * Tests the average command.
   */
  @Test
  public void testAverage() {
    double sum = 0;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        double value = i + j;
        spreadSheet.set(i, j, value);
        sum += value;
      }
    }
    double expectedAverage = sum / 100;

    String input = "average A 1 J 10 Z 1\nq\n";
    executeControllerWithInput(input);
    assertEquals(expectedAverage, spreadSheet.get(25, 0), 0.001);
  }


  /**
   * Tests the range-assign command.
   */
  @Test
  public void testRangeAssign() {
    String input = "range-assign A 1 A 10 1 1\nq\n";
    executeControllerWithInput(input);
    for (int i = 0; i < 10; i++) {
      assertEquals(i + 1.0, spreadSheet.get(0, i), 0.001);
    }
  }
}