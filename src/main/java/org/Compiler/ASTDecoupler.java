package org.Compiler;

import java.util.List;
import java.util.Map;

public class ASTDecoupler {
    private final Map<String, Object> tree;

    private int scope = 0;

    public ASTDecoupler(Map<String, Object> tree) {
        this.tree = tree;
    }

    private void iterateMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue() + "\n");

//            if (entry.getValue().equals("OPEN_CBRACKET")) {
//                scope++;
//            }
//
//            if (entry.getValue().equals("CLOSE_CBRACKET")) {
//                scope--;
//            }

            if (entry.getValue() instanceof Map) {
                iterateMap((Map<String, Object>) entry.getValue());
            } else if (entry.getValue() instanceof List) {

                for (Object item : ((List<?>) entry.getValue())) {
                    if (item instanceof Map) {
                        iterateMap((Map<String, Object>) item);
                    }
                }
            }
        }
    }

    public void uncouple() {
        iterateMap(tree);
    }
}
