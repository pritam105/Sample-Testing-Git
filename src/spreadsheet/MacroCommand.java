package spreadsheet;

/**
 * This interface represents a macro command that can be executed on a spreadsheet.
 */
public interface MacroCommand {

  /**
   * Executes this macro command on the given spreadsheet.
   *
   * @param sheet the spreadsheet on which to execute the macro
   */
  void execute(SpreadSheet sheet);
}