package spreadsheet;

/**
 * NewSparseSpreadSheet extending the SparseSpreadSheet and implementing the
 * MacroSpreadSheet interface to execute a Macro Command.
 */
public class NewSparseSpreadSheet extends SparseSpreadSheet implements MacroSpreadSheet {

  /**
   * Executes this macro command on the given spreadsheet.
   *
   * @param command the command on which to execute the macro
   */
  @Override
  public void execute(MacroCommand command) {
    command.execute(this);
  }
}
