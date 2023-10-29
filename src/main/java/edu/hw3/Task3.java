package edu.hw3;

import java.util.HashMap;
import java.util.List;

public class Task3 {

    private Task3() {

    }

    public static HashMap<Object, Integer> freqDict(List<Object> list) {
        HashMap<Object, Integer> counterTable = new HashMap<>();
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
