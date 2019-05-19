package creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ShapeFactoryTest {

    @Test
    public void ShapeFactory_CircleAsShape_ReturnsCircleInstance(){
        Shape circle = ShapeFactory.getShapeInstance("Circle", 10);
        assertEquals("creational.factory.Circle", circle.getClass().getName());
    }

    @Test
    public void ShapeFactory_TriangleAsShape_ReturnsTriangleInstance(){
        Shape triangle = ShapeFactory.getShapeInstance("Triangle", 10);
        assertEquals("creational.factory.Triangle", triangle.getClass().getName());
    }

    @Test
    public void ShapeFactory_SquareAsShape_ReturnsSquareInstance(){
        Shape square = ShapeFactory.getShapeInstance("Square", 10);
        assertEquals("creational.factory.Square", square.getClass().getName());
    }


    @Test
    public void ShapeFactory_CircleAsShape_And_10AsSide_Returns100AsArea(){
        Shape circle = ShapeFactory.getShapeInstance("Circle", 10);
        assertEquals(314, circle.getArea(), 1);
    }

    @Test
    public void ShapeFactory_SquareAsShape_And_10AsSide_Returns100AsArea(){
        Shape square = ShapeFactory.getShapeInstance("Square", 10);
        assertEquals(100, square.getArea(), 0.1);
    }


    @Test
    public void ShapeFactory_CircleAsShape_And_10AsSide_Returns40AsPerimeter(){
        Shape square = ShapeFactory.getShapeInstance("Circle", 10);
        assertEquals(62.8, square.getPerimeter(), 0.1);
    }

    @Test
    public void ShapeFactory_SquareAsShape_And_10AsSide_Returns40AsPerimeter(){
        Shape square = ShapeFactory.getShapeInstance("Square", 10);
        assertEquals(40, square.getPerimeter(), 0.1);
    }

    @Test
    public void ShapeFactory_TriangleAsShape_And_10AsSide_Returns30AsPerimeter(){
        Shape triangle = ShapeFactory.getShapeInstance("Triangle", 10);
        assertEquals(30, triangle.getPerimeter(), 0.1);
    }
}
