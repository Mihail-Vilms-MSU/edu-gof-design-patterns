package structural.decorator;

/**
 * ~~~ "Decorator" design pattern ~~~
 *
 * Description: Decorator is a structural design pattern that lets you attach new behaviors to objects by placing
 *              these objects inside special wrapper objects that contain the behaviors.
 *
 * Problem: Subclasses can have just one parent class. In most languages, inheritance doesn't let a class inherit
 *          behaviors of multiple classes at the same time.
 *
 * Solution:    One of the ways to overcome these by using Aggregation or Composition instead of Inheritance.
 *              Both of the alternatives work almost the same way: one object has a reference to another and delegates it
 *              some work, whereas with inheritance, the object itself is able to do that work, inheriting the behavior from its superclass.
 *
 * Pros:    - You can extend an object’s behavior without making a new subclass.
 *          - You can add or remove responsibilities from an object at runtime.
 *          - You can combine several behaviors by wrapping an object into multiple decorators.
 *          - Single Responsibility Principle.
 *          You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
 *
 * Cons:    - It’s hard to remove a specific wrapper from the wrappers stack.
 *          - It’s hard to implement a decorator in such a way that its behavior doesn't depend on the order in the decorators stack.
 *          - The initial configuration code of layers might look pretty ugly.
 *
 */

// Decorator – Decorator class implements the component interface and it has a HAS-A relationship with the component interface.
// The component variable should be accessible to the child decorator classes, so we will make this variable protected.
public class CarDecorator implements Car{

    protected Car car;

    public CarDecorator(Car car){
        this.car=car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
