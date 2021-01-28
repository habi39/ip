public class DoneCommand extends Command {

    public DoneCommand(String command, String task, String date) {
        super(command, task, date);
    }

    @Override
    void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException{
            int index = Integer.valueOf(this.task);
            Task curTask = taskList.get(index);
            curTask.markAsDone();
            ui.addDoneString(curTask.toString());
            storage.rewrite(taskList);
    }

    @Override
    boolean isExit() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
