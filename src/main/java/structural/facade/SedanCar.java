package structural.facade;

public class SedanCar implements Car{
    private String model;
    private String engine;
    private String color;

    SedanCar(){
        model = "Audi A4";
        engine = "2.0 L 4-cylinder";
        color = "white";
    }

    @Override
    public void assemble() {
        System.out.println("Assembling sedan " + model + " with engine: " + engine + " and color: " + color);
    }
}
