package structural.decorator;

// Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
// We can have concrete decorator classes as LuxuryCar and SportsCar.
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        this.car.assemble();
        System.out.println("Adding features of Luxury Car.");
    }
}
