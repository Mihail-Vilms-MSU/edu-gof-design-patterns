package creational.factory;

/**
 * Factory design pattern is used when we have a super class with multiple sub-classes and based on input,
 * we need to return one of the sub-class. This pattern take out the responsibility of instantiation of
 * a class from client program to the factory class.
 * We have "Shape" superclass and subclasses: "Circle", "Square", "Triangle".
 * Notice that based on the input parameter, different subclass is created and returned. "getShapeInstance" is the factory method.
 *
 * Factory Design Pattern Advantages
 * 1) Factory design pattern provides approach to code for interface rather than implementation.
 * 2) Factory pattern removes the instantiation of actual implementation classes from client code.
 *    Factory pattern makes our code more robust, less coupled and easy to extend.
 *    For example, we can easily change "Triangle" class implementation because client program is unaware of this.
 * 3) Factory pattern provides abstraction between implementation and client classes through inheritance.
 */

public class ShapeFactory {

    public static Shape getShapeInstance(String shape, float shapeParam){
        if ("Circle".equals(shape)) return new Circle(shapeParam);
        if ("Square".equals(shape)) return new Square(shapeParam);
        if ("Triangle".equals(shape)) return new Triangle(shapeParam);
        return null;
    }

}
