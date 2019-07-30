package behavioral.state;

public class InWork implements TaskState{
    @Override
    public void next(Task task) {
        task.setState(new Resolved());
    }

    @Override
    public void previous(Task task) {
        task.setState(new Assigned());
    }

    @Override
    public void printStatus() {
        System.out.println("Task already has been taken into work, but not resolved yet.");
    }
}
