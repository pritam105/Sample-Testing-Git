package spreadsheet;

import java.util.Scanner;

/**
 * A controller for an interactive spreadsheet application that extends the functionality
 * of the base SpreadSheetController. It adds commands for bulk assignments, averaging values,
 * and range assignments within the spreadsheet.
 */
public class NewSpreadSheetController extends SpreadSheetController {

  /**
   * Constructs a new spreadsheet controller with the given model, input source, and output target.
   *
   * @param sheet the spreadsheet model to interact with
   * @param readable the source of commands from the user
   * @param appendable the target for messages to be transmitted to the user
   */
  public NewSpreadSheetController(SpreadSheet sheet, Readable readable,
                                       Appendable appendable) {
    super(sheet, readable, appendable);
  }

  /**
   * Processes extended commands for the spreadsheet. Supports additional operations
   * such as bulk value assignment, averaging, and range assignment.
   *
   * @param userInstruction the command entered by the user
   * @param sc the scanner to read additional command arguments
   * @param sheet the spreadsheet model where the command is executed
   */
  protected void processCommand(String userInstruction, Scanner sc,
                                SpreadSheet sheet) {
    switch (userInstruction) {
      case "bulk-assign-value":
        int fromRow = getRowNum(sc.next());
        int fromCol = sc.nextInt();
        int toRow = getRowNum(sc.next());
        int toCol = sc.nextInt();
        double value = sc.nextDouble();
        MacroCommand macro = new BulkMacroAssign(fromRow, fromCol - 1,
                toRow, toCol - 1, value);
        ((MacroSpreadSheet) sheet).execute(macro);
        break;

      case "average":
        fromRow = getRowNum(sc.next());
        fromCol = sc.nextInt() - 1;
        toRow = getRowNum(sc.next());
        toCol = sc.nextInt() - 1;
        int destRow = getRowNum(sc.next());
        int destCol = sc.nextInt() - 1;
        MacroCommand averageMacro = new MacroAverage(fromRow, fromCol, toRow,
                toCol, destRow, destCol);
        ((MacroSpreadSheet) sheet).execute(averageMacro);
        break;

      case "range-assign":
        fromRow = getRowNum(sc.next());
        fromCol = sc.nextInt() - 1;
        toRow = getRowNum(sc.next());
        toCol = sc.nextInt() - 1;
        double startValue = sc.nextDouble();
        double increment = sc.nextDouble();
        MacroCommand rangeAssignMacro = new MacroRangeAssign(fromRow, fromCol,
                toRow, toCol, startValue, increment);
        ((MacroSpreadSheet) sheet).execute(rangeAssignMacro);
        break;

      default:
        super.processCommand(userInstruction, sc, sheet);
        break;
    }
  }

  /**
   * Prints the enhanced menu, including the additional commands supported by this class.
   *
   * @throws IllegalStateException if the controller is not in a valid state
   */
  protected void printMenu() throws IllegalStateException {
    super.printMenu();
    writeMessage("bulk-assign-value from-row from-col to-row to-col value"
            + System.lineSeparator());
    writeMessage("average from-row-num from-col-num to-row-num to-col-num "
            + "dest-row-num dest-col-num"
            + System.lineSeparator());
    writeMessage("range-assign from-row-num from-col-num to-row-num to-col-num"
            + " start-value increment"
            + System.lineSeparator());
  }
}
