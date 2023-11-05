package edu.hw4.comporators;


import edu.hw4.Animal;
import java.util.Comparator;

public class MaxHeighComporator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.height() - o2.height();
    }
}
