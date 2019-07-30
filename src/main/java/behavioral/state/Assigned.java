package behavioral.state;

public class Assigned implements TaskState {
    @Override
    public void next(Task task) {
        task.setState(new InWork());
    }

    @Override
    public void previous(Task task) {
        task.setState(new Created());
    }

    @Override
    public void printStatus() {
        System.out.println("Task already assigned, but has not been taken in work yet.");
    }
}
