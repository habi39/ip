import java.io.IOException;
/**
   * Command is an abstract class
   *
   * @param command the main action of the command
   * @param task the description of the task
   * @param date the due date specified by user
   */
public abstract class Command {
    String command, task, date;

    public Command(String command, String task, String date) {
        this.command = command;
        this.task = task;
        this.date = date;
    }
    
    abstract void execute(TaskList taskList, Ui ui, Storage storage) throws IOException;

    abstract boolean isExit();
}
