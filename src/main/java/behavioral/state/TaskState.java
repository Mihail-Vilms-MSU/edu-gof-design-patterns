package behavioral.state;


/**
 * ~~~ "State" design pattern ~~~
 *
 * Problem:     The main idea of State pattern is to allow the object for changing its behavior without changing its class.
 *
 * Solution:    Our context is going to delegate the behavior to the state implementation.
 *              In other words, all incoming requests will be handled by the concrete implementation of the state.
 *
 * Pros:        Organize the code related to particular states into separate classes.
 *              Introduce new states without changing existing state classes or the context.
 *
 * Cons:        Applying the pattern can be overkill if a state machine has only a few states or rarely changes.
 *
 *
 * State vs. Strategy Pattern:
 *
 *              - State can be considered as an extension of Strategy.
 *              Both patterns are based on composition: they change the behavior of the context by delegating some work to helper objects.
 *
 *              - In strategy, the client has to be aware of the possible strategies to use and change them explicitly.
 *              Whereas in state pattern, each state is linked to another and create the flow as in Finite State Machine.
 *
 *              - Strategy makes these objects completely independent and unaware of each other.
 *
 *              - However, State doesn’t restrict dependencies between concrete states, letting them alter the state of the context at will.
 *
 */

public interface TaskState {
    void next(Task task);
    void previous(Task task);
    void printStatus();
}
