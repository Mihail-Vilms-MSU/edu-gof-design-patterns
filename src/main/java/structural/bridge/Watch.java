package structural.bridge;

/**
 * ~~~ "Bridge" design pattern ~~~
 *
 * The official definition for Bridge design pattern introduced by Gang of Four (GoF) is to decouple an abstraction
 * from its implementation so that the two can vary independently.
 *
 * This means to create a bridge interface that uses OOP principles to separate out responsibilities into different abstract classes.
 *
 * Problem: For the Bridge pattern, we’ll consider two layers of abstraction;
 *          Bridge is a structural design pattern that lets you split a large class or a set of closely related classes
 *          into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
 *
 * Solution:    This problem occurs because we’re trying to extend the shape classes in two independent dimensions:
 *              by form and by color. That’s a very common issue with class inheritance. The Bridge pattern attempts
 *              to solve this problem by switching from inheritance to the object composition. What this means is that
 *              you extract one of the dimensions into a separate class hierarchy, so that the original classes will reference
 *              an object of the new hierarchy, instead of having all of its state and behaviors within one class.
 *
 * Pros:    The client code works with high-level abstractions. It isn’t exposed to the platform details.
 *          Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
 *          Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.
 *
 * Cons:    You might make the code more complicated by applying the pattern to a highly cohesive class.
 */

public abstract class Watch {
    protected Assembler assembler;

    Watch(Assembler assembler){
        this.assembler = assembler;
    }

    abstract public void assemble();
}
