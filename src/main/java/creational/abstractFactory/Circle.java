package creational.abstractFactory;

public class Circle extends Shape {

    private float radius;

    @Override
    public float getPerimeter() {
        return (float)3.14*2*radius;
    }

    @Override
    public float getArea() {
        return (float)3.14*radius*radius;
    }

    public Circle(float radius){
        this.radius = radius;
    }
}
