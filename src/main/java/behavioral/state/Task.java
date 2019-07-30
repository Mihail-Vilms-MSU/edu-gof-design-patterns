package behavioral.state;

class Task {
    private TaskState state = new Created();

    public TaskState getState() {
        return state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void previousState() {
        state.previous(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus(){
        state.printStatus();
    }
}
