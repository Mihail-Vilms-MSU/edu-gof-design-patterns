package creational.abstractFactory;

import static java.lang.StrictMath.sqrt;

public class Triangle extends Shape{

    private float side;

    @Override
    public float getPerimeter() {
        return side*3;
    }

    @Override
    public float getArea() {
        return (float)sqrt(3)*side*side/4;
    }

    public Triangle(float side){
        this.side = side;
    }
}
