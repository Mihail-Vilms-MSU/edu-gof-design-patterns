package structural.bridge;

public class Rolex extends Watch {
    public Rolex(Assembler assembler) {
        super(assembler);
    }

    public void assemble() {
        System.out.println("Assembling Rolex watch");
        assembler.assemble();
    }
}
