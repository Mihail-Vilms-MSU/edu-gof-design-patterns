package behavioral.chainOfResponsibility;


/**
 * ~~~ Chain of responsibility ~~~
 *
 * Usage:   Chain of responsibility pattern is used to achieve loose coupling in software design where a request from
 *          the client is passed to a chain of objects to process them. Later, the object in the chain will decide
 *          themselves who will be processing the request and whether the request is required to be sent to the next
 *          object in the chain or not.
 *
 * Pros:    You can control the order of request handling.
 *          You can decouple classes that invoke operations from classes that perform operations.
 *          You can introduce new handlers into the app without breaking the existing client code.
 *
 * Cons:    Some requests may end up unhandled.
 *
 */

public interface SupportLine {
    void setNextLine(SupportLine nextLine);
    void handleRequest(SupportRequest request);
}
