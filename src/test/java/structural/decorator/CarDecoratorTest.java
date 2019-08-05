package structural.decorator;

import org.junit.Test;

public class CarDecoratorTest {

    @Test
    public void assembleCars(){
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
