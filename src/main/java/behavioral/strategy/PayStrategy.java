package behavioral.strategy;


/**
 * ~~~ Strategy design pattern ~~~/
 *
 * Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
 *
 * Pros:        You can swap algorithms used inside an object at runtime
 *              You can isolate the implementation details of an algorithm from the code that uses it
 *              You can replace inheritance with composition
 *              Open/Closed Principle. You can introduce new strategies without having to change the context
 *
 * Cons:        If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the
 *              program with new classes and interfaces that come along with the pattern.
 *              Clients must be aware of the differences between strategies to be able to select a proper one.
 *
 */

public interface PayStrategy {
    String pay(int paymentAmount);
}
