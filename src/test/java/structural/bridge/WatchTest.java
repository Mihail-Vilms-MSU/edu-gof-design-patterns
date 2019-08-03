package structural.bridge;

import org.junit.Test;

public class WatchTest {

    @Test
    public void assembling_Watches_Automatically(){
        Assembler assembler = new AutoAssembler();

        Watch rolex = new Rolex(assembler);
        rolex.assemble();

        Watch omega = new Omega(assembler);
        omega.assemble();

        Watch patek = new Patek(assembler);
        patek.assemble();
    }

    @Test
    public void assembling_Watches_Manually(){
        Assembler assembler = new ManualAssembler();

        Watch rolex = new Rolex(assembler);
        rolex.assemble();

        Watch omega = new Omega(assembler);
        omega.assemble();

        Watch patek = new Patek(assembler);
        patek.assemble();
    }

}
