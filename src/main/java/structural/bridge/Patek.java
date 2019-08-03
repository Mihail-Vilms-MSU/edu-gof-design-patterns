package structural.bridge;

public class Patek extends Watch {

    public Patek(Assembler assembler) {
        super(assembler);
    }

    public void assemble() {
        System.out.println("Assembling Patek watch");
        assembler.assemble();
    }
}
