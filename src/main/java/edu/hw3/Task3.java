package edu.hw3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {

    private Task3() {

    }

    public static Map<Object, Integer> freqDict(List<Object> list) {
        Map<Object, Integer> counterTable = new HashMap<>();
        for (var i : list) {
            if (counterTable.containsKey(i)) {
                counterTable.put(i, counterTable.get(i) + 1);
            } else {
                counterTable.put(i, 1);
            }
        }
        return counterTable;
    }
}
