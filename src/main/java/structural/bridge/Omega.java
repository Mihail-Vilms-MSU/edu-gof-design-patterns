package structural.bridge;

public class Omega extends Watch {
    public Omega(Assembler assembler) {
        super(assembler);
    }

    public void assemble() {
        System.out.println("Assembling Omega watch");
        assembler.assemble();
    }
}
