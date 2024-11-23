package spreadsheet;

import java.io.IOException;
import java.util.Scanner;

/**
 * This class represents the controller of an interactive spreadsheet application.
 * This controller offers a simple text interface in which the user can
 * type instructions to manipulate a spreadsheet.
 */
public class SpreadSheetController {
  private Readable readable;
  private Appendable appendable;
  private SpreadSheet sheet;

  /**
   * Create a controller to work with the specified sheet (model),
   * readable (to take inputs) and appendable (to transmit output).
   *
   * @param sheet      the sheet to work with (the model)
   * @param readable   the Readable object for inputs
   * @param appendable the Appendable objects to transmit any output
   */
  public SpreadSheetController(SpreadSheet sheet, Readable readable, Appendable appendable) {
    if ((sheet == null) || (readable == null) || (appendable == null)) {
      throw new IllegalArgumentException("Sheet, readable or appendable is null");
    }
    this.sheet = sheet;
    this.appendable = appendable;
    this.readable = readable;
  }

  /**
   * The main method that relinquishes control of the application to the controller.
   *
   * @throws IllegalStateException if the controller is unable to transmit output
   */
  public void control() throws IllegalStateException {
    Scanner sc = new Scanner(readable);
    boolean quit = false;


    //print the welcome message
    this.welcomeMessage();

    while (!quit && sc.hasNext()) { //continue until the user quits
      writeMessage("Type instruction: "); //prompt for the instruction name
      String userInstruction = sc.next(); //take an instruction name
      if (userInstruction.equals("quit") || userInstruction.equals("q")) {
        quit = true;
      } else {
        processCommand(userInstruction, sc, sheet);
      }
    }
    this.farewellMessage();

  }

  /**
   * Processes the given command from the user.
   *
   * @param userInstruction the command entered by the user
   * @param sc              the scanner to read additional command arguments
   * @param sheet           the spreadsheet model where the command is executed
   */
  protected void processCommand(String userInstruction, Scanner sc, SpreadSheet sheet) {
    int row;
    int col;
    double value;

    switch (userInstruction) {
      case "assign-value": //assign a value to a cell
        try {
          row = getRowNum(sc.next()); //get in the row string
          col = sc.nextInt(); //get in the column number, starting with 1
          value = sc.nextDouble();
          System.out.println("Setting cell (" + row + "," + (col - 1));
          sheet.set(row, col - 1, value); //use the spreadsheet
        } catch (IllegalArgumentException e) {
          writeMessage("Error: " + e.getMessage() + System.lineSeparator());
        }
        break;
      case "print-value": //print a value from the cell
        try {
          row = getRowNum(sc.next()); //get the row string
          col = sc.nextInt(); //get the column number, starting with 1
          writeMessage("Value: " + sheet.get(row, col - 1) + System.lineSeparator());
        } catch (IllegalArgumentException e) {
          writeMessage("Error: " + e.getMessage() + System.lineSeparator());
        }
        break;
      case "menu": //print the menu of supported instructions
        welcomeMessage();
        break;
      default: //error due to unrecognized instruction
        writeMessage("Undefined instruction: " + userInstruction + System.lineSeparator());
    }
  }

  /**
   * Converts a string representing spreadsheet row labels into a zero-based row number.
   *
   * @param rowLetters the string representation of the row
   * @return the zero-based row number
   * @throws IllegalArgumentException if the row label contains non-alphabetic characters
   */
  protected int getRowNum(String rowLetters) throws IllegalArgumentException {
    int rownumber = 0;

    for (int i = 0; i < rowLetters.length(); i = i + 1) {
      char c = rowLetters.charAt(i);
      if (!Character.isAlphabetic(c)) {
        throw new IllegalArgumentException("Invalid row");
      }
      rownumber = 26 * rownumber + ((int) Character.toLowerCase(c) - 'a' + 1);
    }
    return rownumber - 1;
  }

  /**
   * Appends the given message to the appendable field.
   *
   * @param message the message to be transmitted
   * @throws IllegalStateException if appending the message is not possible
   */
  protected void writeMessage(String message) throws IllegalStateException {
    try {
      appendable.append(message);

    } catch (IOException e) {
      throw new IllegalStateException(e.getMessage());
    }
  }

  /**
   * Prints the menu of available commands to the appendable field.
   *
   * @throws IllegalStateException if printing the menu is not possible
   */
  protected void printMenu() throws IllegalStateException {
    writeMessage("Supported user instructions are: " + System.lineSeparator());
    writeMessage("assign-value row-num col-num value (set a cell to a value)"
            + System.lineSeparator());
    writeMessage("print-value row-num col-num (print the value at a given cell)"
            + System.lineSeparator());
    writeMessage("menu (Print supported instruction list)" + System.lineSeparator());
    writeMessage("q or quit (quit the program) " + System.lineSeparator());
  }

  /**
   * Sends a welcome message to the user through the appendable field.
   *
   * @throws IllegalStateException if transmitting the message is not possible
   */
  protected void welcomeMessage() throws IllegalStateException {
    writeMessage("Welcome to the spreadsheet program!" + System.lineSeparator());
    printMenu();
  }

  /**
   * Sends a farewell message to the user through the appendable field.
   *
   * @throws IllegalStateException if transmitting the message is not possible
   */
  protected void farewellMessage() throws IllegalStateException {
    writeMessage("Thank you for using this program!");
  }


}
