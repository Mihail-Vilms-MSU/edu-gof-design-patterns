package behavioral.state;

public class Resolved implements TaskState{
    @Override
    public void next(Task task) {
        System.out.println("The task is in its final state: Resolved");
    }

    @Override
    public void previous(Task task) {
        task.setState(new InWork());
    }

    @Override
    public void printStatus() {
        System.out.println("Task has been resolved already.");
    }
}
