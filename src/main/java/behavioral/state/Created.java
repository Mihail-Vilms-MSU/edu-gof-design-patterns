package behavioral.state;

public class Created implements TaskState {
    @Override
    public void next(Task task) {
        task.setState(new Assigned());
    }

    @Override
    public void previous(Task task) {
        System.out.println("The task is in its root state: Created");
    }

    @Override
    public void printStatus() {
        System.out.println("Task created, not assigned yet.");
    }
}
