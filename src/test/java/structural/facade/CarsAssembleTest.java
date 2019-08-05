package structural.facade;

import org.junit.Test;

public class CarsAssembleTest {
    @Test
    public void assembleSportCar(){
        CarsAssembler assembler = new CarsAssembler();

        assembler.assembleSedan();
        assembler.assembleSportCar();
    }
}
