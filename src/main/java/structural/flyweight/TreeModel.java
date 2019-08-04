package structural.flyweight;

public class TreeModel {
    private String type;
    private String color;
    private String otherTreeData;

    TreeModel(String name, String color, String otherTreeData){
        this.type = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(int x, int y){
        System.out.println("Drawing tree: " + type + " with color: " + color + " at coordinates: (" + x + ";" + y + "); " + otherTreeData);
    }
}
