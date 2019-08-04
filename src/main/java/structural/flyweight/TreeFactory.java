package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeModel> treeTypes = new HashMap<String, TreeModel>();

    public static TreeModel getTreeType(String type, String color, String otherTreeData) {
        TreeModel model = treeTypes.get(type);

        if (model == null) {
            model = new TreeModel(type, color, otherTreeData);
            treeTypes.put(type, model);
        }

        return model;
    }
}
