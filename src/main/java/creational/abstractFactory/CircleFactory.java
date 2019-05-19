package creational.abstractFactory;

public class CircleFactory implements ShapeAbstractFactory{
    private float radius;

    public CircleFactory(float radius){
        this.radius = radius;
    }

    public Shape createShape() {
        return new Circle(radius);
    }
}
