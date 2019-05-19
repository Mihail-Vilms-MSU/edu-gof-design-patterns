package creational.abstractFactory;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeFactoryTest {

    @Test
    public void getShape_CircleFactoryAsInput_ReturnsCircleInstance(){
        Shape circle = ShapeFactory.getShape(new CircleFactory(10));
        assertEquals("creational.abstractFactory.Circle", circle.getClass().getName());
    }

    @Test
    public void getShape_SquareFactoryAsInput_ReturnsSquareInstance(){
        Shape square = ShapeFactory.getShape(new SquareFactory(10));
        assertEquals("creational.abstractFactory.Square", square.getClass().getName());
    }

    @Test
    public void getShape_TriangleFactoryAsInput_ReturnsTriangleInstance(){
        Shape triangle = ShapeFactory.getShape(new TriangleFactory(10));
        assertEquals("creational.abstractFactory.Triangle", triangle.getClass().getName());
    }


    @Test
    public void getShape_CircleFactoryAsInput_And_10AsRadius_ReturnsArea(){
        Shape circle = ShapeFactory.getShape(new CircleFactory(10));
        assertEquals(314, circle.getArea(), 1);
    }

    @Test
    public void getShape_SquareFactoryAsShape_And_10AsSide_ReturnsArea(){
        Shape square = ShapeFactory.getShape(new SquareFactory(10));
        assertEquals(100, square.getArea(), 0.1);
    }


    @Test
    public void getShape_CircleFactoryAsInput_And_10AsRadius_ReturnsPerimeter(){
        Shape circle = ShapeFactory.getShape(new CircleFactory(10));
        assertEquals(62.8, circle.getPerimeter(), 1);
    }

    @Test
    public void getShape_SquareFactoryAsInput_And_10AsRadius_ReturnsPerimeter(){
        Shape square = ShapeFactory.getShape(new SquareFactory(10));
        assertEquals(40, square.getPerimeter(), 1);
    }

    @Test
    public void getShape_TriangleFactoryAsInput_And_10AsRadius_ReturnsPerimeter(){
        Shape triangle = ShapeFactory.getShape(new TriangleFactory(10));
        assertEquals(30, triangle.getPerimeter(), 1);
    }
}
