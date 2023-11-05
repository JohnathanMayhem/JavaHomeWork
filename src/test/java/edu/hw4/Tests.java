package edu.hw4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    @Test
    public void testSortWithHeight() {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(
            new Animal(
                "dog1",
                Animal.Type.DOG,
                Animal.Sex.F,
                3,
                60,
                40,
                true
            )
        );
        animalList.add(
            new Animal(
                "cat1",
                Animal.Type.CAT,
                Animal.Sex.M,
                1,
                50,
                20,
                false
            )
        );

        animalList.add(
            new Animal(
                "bird1",
                Animal.Type.BIRD,
                Animal.Sex.M,
                7,
                90,
                80,
                false
            )
        );

        List<Animal> sortedAnimalList = AnimalsUtils.sortWithHeight(animalList);
        List<Animal> requareList = new ArrayList<Animal>();
        requareList.add(
            new Animal(
                "cat1",
                Animal.Type.CAT,
                Animal.Sex.M,
                1,
                50,
                20,
                false
            )
        );
        requareList.add(
            new Animal(
                "dog1",
                Animal.Type.DOG,
                Animal.Sex.F,
                3,
                60,
                40,
                true
            )
        );
        requareList.add(
            new Animal(
                "bird1",
                Animal.Type.BIRD,
                Animal.Sex.M,
                7,
                90,
                80,
                false
            )
        );

        assertTrue(requareList.equals(sortedAnimalList));
    }

}
