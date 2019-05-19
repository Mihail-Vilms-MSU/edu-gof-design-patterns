package creational.abstractFactory;

public class SquareFactory implements ShapeAbstractFactory {
    private float side;

    public SquareFactory(float side) {
        this.side = side;
    }

    public Shape createShape() {
        return new Square(side);
    }
}
