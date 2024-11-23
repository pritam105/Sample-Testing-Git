package spreadsheet;

/**
 * An interface that extends SpreadSheet to support the execution of macro commands.
 */
public interface MacroSpreadSheet extends SpreadSheet {

  /**
   * Executes a given macro command on the spreadsheet.
   *
   * @param command the macro command to execute
   */
  void execute(MacroCommand command);

}
