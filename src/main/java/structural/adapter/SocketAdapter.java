package structural.adapter;

/**
 * ~~~~ Adapter design pattern ~~~~
 *
 * Problem: We have data represented in some class and some other consumer classes that have to work
 *          with this data but have no appropriate interaction approach.
 *
 * Solution: In this case one can wrap data classes into appropriate format for consumer class to interact with them;
 *
 * Pros:    You can keep technical data transformation logic aside from business logic
 *          You can implement several adapters in case you have several without breaking target class ot consumer class
 *
 * Cons:    Complexity of code increases since you have to add several new interfaces and/or classes. Sometimes
 *          in changing
 */

public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();
}
