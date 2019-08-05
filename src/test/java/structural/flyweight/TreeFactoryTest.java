package structural.flyweight;

import org.junit.Test;

public class TreeFactoryTest {

    @Test
    public void creatingTrees(){
        TreeModel oakModel = TreeFactory.getTreeType("Oak", "Red", "Oak's additional data");
        Tree oak = new Tree(10, 20, oakModel);
        oak.draw();

        TreeModel mapleModel = TreeFactory.getTreeType("Maple", "Yellow", "Maple's additional data");
        Tree maple = new Tree(20, 30, mapleModel);
        maple.draw();

        TreeModel sameOakModel = TreeFactory.getTreeType("Oak", "***", "***");
        Tree anotherOak = new Tree(40, 50, oakModel);
        anotherOak.draw();
    }
}
