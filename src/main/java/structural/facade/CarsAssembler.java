package structural.facade;


/**
 * Description: Facade pattern hides the complexities of the system and provides an interface to the client using which
 *              the client can access the system. This type of design pattern comes under structural pattern as this
 *              pattern adds an interface to existing system to hide its complexities. This pattern involves a single
 *              class which provides simplified methods required by client and delegates calls to methods of existing system classes.
 *
 * Pros: You can isolate your code from the complexity of a subsystem.
 *
 * Cons: A facade can become a god object coupled to all classes of an app.
 */

// facade class
public class CarsAssembler {
    private Car sportCar;
    private Car sedan;

    public CarsAssembler(){
        sportCar = new SportCar();
        sedan = new SedanCar();
    }

    public void assembleSportCar(){
        sportCar.assemble();
    }

    public void assembleSedan(){
        sedan.assemble();
    }
}
