package behavioral.state;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class TaskStateTest {

    @Test
    public void givenNewTask_checkStates(){
        Task task = new Task();
        task.printStatus();

        assertThat(task.getState(), instanceOf(Created.class));

        task.nextState();
        task.printStatus();
        task.nextState();
        task.printStatus();

        assertThat(task.getState(), instanceOf(InWork.class));

        task.previousState();
        task.printStatus();

        assertThat(task.getState(), instanceOf(Assigned.class));

        task.nextState();
        task.printStatus();
        task.nextState();
        task.printStatus();

        assertThat(task.getState(), instanceOf(Resolved.class));
    }

}
