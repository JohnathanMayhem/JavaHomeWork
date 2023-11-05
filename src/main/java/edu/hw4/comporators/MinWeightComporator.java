package edu.hw4.comporators;

import edu.hw4.Animal;
import java.util.Comparator;

public class MinWeightComporator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.weight() - o1.weight();
    }
}
