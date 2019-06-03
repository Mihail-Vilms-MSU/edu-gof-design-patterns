package structural.proxy;

import java.util.List;

/**
 * ~~~~ Proxy design pattern ~~~~
 *
 * Problem:     Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
 *              A proxy controls access to the original object, allowing you to perform something either before or after
 *              the request gets through to the original object.The definition itself is very clear and proxy design pattern
 *              is used when we want to provide controlled access of a functionality.
 *
 * Solution:    The Proxy pattern suggests that you create a new proxy class with the same interface as an original service object.
 *              Then you update your app so that it passes the proxy object to all of the original object’s clients.
 *              Upon receiving a request from a client, the proxy creates a real service object and delegates all the work to it.
 *
 * Pros:        You can control the service object without clients knowing about it.'
 *              You can manage the lifecycle of the service object when clients don’t care about it.
 *              Open/Closed Principle. You can introduce new proxies without changing the service or clients.
 *
 * Cons:        The code may become more complicated since you need to introduce a lot of new classes.
 *              The response from the service might get delayed.
 *
 */

public class InternetProxy implements Internet{
    private Internet internet;
    private List<String> bannedSites;

    public void setInternet(Internet internet){
        this.internet = internet;
    }

    public void setBannedSites(List<String> bannedSites){
        this.bannedSites = bannedSites;
    }

    public String connectTo(String serverHost) {
        if (this.bannedSites.contains(serverHost)){
            return "Access Denied";
        }

        return internet.connectTo(serverHost);
    }
}
