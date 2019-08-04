package structural.flyweight;

public class Tree {
    private int x;
    private int y;
    private TreeModel treeModel;

    public Tree(int x, int y, TreeModel treeModel) {
        this.x = x;
        this.y = y;
        this.treeModel = treeModel;
    }

    public void draw() {
        this.treeModel.draw(this.x, this.y);
    }

}
