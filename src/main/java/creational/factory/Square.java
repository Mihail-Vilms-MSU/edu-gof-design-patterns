package creational.factory;


public class Square extends Shape{

    private float side;

    @Override
    public float getPerimeter() {
        return side*4;
    }

    @Override
    public float getArea() {
        return side*side;
    }

    public Square(float side){
        this.side = side;
    }
}
