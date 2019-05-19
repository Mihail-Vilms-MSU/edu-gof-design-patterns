package creational.abstractFactory;

public class TriangleFactory implements ShapeAbstractFactory {
    private float side;

    public TriangleFactory(float side) {
        this.side = side;
    }

    public Shape createShape() {
        return new Triangle(side);
    }
}
