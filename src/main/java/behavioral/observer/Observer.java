package behavioral.observer;

import java.util.Map;


/**
 * ~~~ "Observer" design pattern ~~~
 * Description: Observer design pattern is useful when you are interested in the state of an object and want to get
 *              notified whenever there is any change. In observer pattern, the object that watch on the state of
 *              another object are called Observer and the object that is being watched is called Subject.
 *              Subject contains a list of observers to notify of any change in it’s state, so it should provide
 *              methods using which observers can register and unregister themselves. Subject also contain a method to
 *              notify all the observers of any change and either it can send the update while notifying the observer
 *              or it can provide another method to get the update.
 *
 * Pros:    Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s
 *          code (and vice versa if there’s a publisher interface).
 *          You can establish relations between objects at runtime.
 */
public interface Observer {
    void update(Map<String, Integer> stockPrices);
}
