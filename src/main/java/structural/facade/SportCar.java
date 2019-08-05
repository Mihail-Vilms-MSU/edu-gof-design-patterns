package structural.facade;

public class SportCar implements Car{
    private String model;
    private String engine;
    private String color;

    SportCar(){
        model = "Ford Mustang";
        engine = "2.3 L 4-cylinder, 5.0 L V8";
        color = "red";
    }

    @Override
    public void assemble() {
        System.out.println("Assembling sport car " + model + " with engine: " + engine + " and color: " + color);
    }
}
