package edu.hw4;

import edu.hw4.comporators.MaxHeighComporator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsUtils {
    private AnimalsUtils() {
    }

    //Отсортировать животных по росту от самого маленького к самому большому -> List<Animal>
    public static List<Animal> sortWithHeight(List<Animal> animals) {
        List<Animal> animalsSorted = new ArrayList<>(animals);
        Comparator<Animal> comporator = new MaxHeighComporator();
        Collections.sort(animalsSorted, comporator);
        return animalsSorted;
    }

    //Отсортировать животных по весу от самого тяжелого к самому легкому, выбрать k первых -> List<Animal>
    public static List<Animal> chooseMostWeighed(List<Animal> animals, int k) {
        animals.sort(Comparator.comparingInt(Animal::weight).reversed());
        return animals.subList(0, Math.min(k, animals.size()));
    }

    //Сколько животных каждого вида -> Map<Animal.Type, Integer>
    public static Map<Animal.Type, Integer> diagram(List<Animal> animals) {
        Map<Animal.Type, Integer> animalCounts = new HashMap<>();
        for (Animal animal : animals) {
            animalCounts.put(animal.type(), animalCounts.getOrDefault(animal.type(), 0) + 1);
        }
        return animalCounts;
    }

    //У какого животного самое длинное имя -> Animal
    public static Animal animalWithTheLongestName(List<Animal> animals) {
        Animal animalWithLongestName = null;
        for (Animal animal : animals) {
            if (animalWithLongestName == null || animal.name().length() > animalWithLongestName.name().length()) {
                animalWithLongestName = animal;
            }
        }
        return animalWithLongestName;
    }

    //Каких животных больше: самцов или самок -> Sex
    public static Animal.Sex mostPopularSex(List<Animal> animals) {
        int maleCount = 0;
        int femaleCount = 0;
        for (Animal animal : animals) {
            if (animal.sex() == Animal.Sex.M) {
                maleCount++;
            } else if (animal.sex() == Animal.Sex.F) {
                femaleCount++;
            }
        }
        return (maleCount > femaleCount) ? Animal.Sex.M : Animal.Sex.F;
    }

    //Самое тяжелое животное каждого вида -> Map<Animal.Type, Animal>
    public static Map<Animal.Type, Animal> theMostWheighedAnimals(List<Animal> animals) {
        return animals.stream()
            .collect(Collectors.groupingBy(
                Animal::type,
                Collectors.maxBy(Comparator.comparingInt(Animal::weight))
            ))
            .entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().orElse(null)));
    }

    //K-е самое старое животное -> Animal
    public static Animal kTheOldestAnimal(List<Animal> animals, Integer k) {
        Optional<Animal> kOldestAnimal = animals.stream()
            .sorted((o1, o2) -> Integer.compare(o2.age(), o1.age())).skip(k - 1).findFirst();
        return kOldestAnimal.orElse(null);
    }

    //Самое тяжелое животное среди животных ниже k см -> Optional<Animal>
    public static Optional<Animal> theHeaviestAnimalLowerThenKSM(List<Animal> animals, Integer k) {
        return animals.stream()
            .filter(animal -> animal.height() < k)
            .max(Comparator.comparingInt(Animal::weight));
    }

    //Сколько в сумме лап у животных в списке -> Integer
    public static Integer totalAmountOfPaws(List<Animal> animals) {
        int amount = 0;
        for (Animal a : animals) {
            amount += a.paws();
        }
        return amount;
    }

    //Список животных, возраст у которых не совпадает с количеством лап -> List<Animal>
    public static List<Animal> powsNotEquals(List<Animal> animals) {
        return animals.stream().filter(animal -> (animal.paws() != animal.age())).toList();
    }

    //Список животных, которые могут укусить (bites == true) и рост которых превышает 100 см -> List<Animal>
    @SuppressWarnings("MagicNumber")
    public static List<Animal> whoCanBitAndHigh(List<Animal> animals) {
        return animals.stream().filter(animal -> (animal.height() > 100 && animal.bites())).toList();
    }

    //Сколько в списке животных, вес которых превышает рост -> Integer
    public static Integer totalAmountOfAnimalsWhoseWeightBiggerThanHeight(List<Animal> animals) {
        List<Animal> sutableAnimals = animals.stream().filter(animal -> (animal.height() < animal.weight())).toList();
        return sutableAnimals.size();
    }

    //Список животных, имена которых состоят из более чем двух слов -> List<Animal>
    public static List<Animal> whoseNamesAreMoreThanTwoWords(List<Animal> animals) {
        return animals.stream().filter(animal -> (animal.name().split(" ").length >= 2)).toList();
    }

    //Есть ли в списке собака ростом более k см -> Boolean
    public static boolean isThereADogWithHeightMoreThanK(List<Animal> animals, Integer k) {
        return animals.stream().anyMatch(animal -> (animal.type().equals(Animal.Type.DOG) && animal.height() > k));
    }

    //Найти суммарный вес животных каждого вида, которым от k до l лет -> Map<Animal.Type, Integer>
    public static Map<Animal.Type, Integer> totalWightOfAnimalTypes(List<Animal> animals, Integer k, Integer l) {
        return animals.stream()
            .filter(animal -> animal.age() >= k && animal.age() <= l)
            .collect(Collectors.groupingBy(Animal::type, Collectors.summingInt(Animal::weight)));
    }

    //Список животных, отсортированный по виду, затем по полу, затем по имени -> List<Animal>
    public static List<Animal> sortedByTypeSexName(List<Animal> animals) {
        return animals.stream().sorted(Comparator.comparing(Animal::type)
                .thenComparing(Animal::sex)
                .thenComparing(Animal::name))
            .collect(Collectors.toList());
    }

    //Правда ли, что пауки кусаются чаще, чем собаки -> Boolean (если данных для ответа недостаточно, вернуть false)
    public static boolean isThatTrueThatSpidersBitMoreThatDogs(List<Animal> animals) {
        if (animals.stream().filter(a -> a.type().equals(Animal.Type.SPIDER)).toList().isEmpty()
            || animals.stream().filter(a -> a.type().equals(Animal.Type.DOG)).toList().isEmpty()) {
            return false;
        } else {
            double spidersStatistic =
                (double) animals.stream().filter(a -> a.type().equals(Animal.Type.SPIDER) && a.bites()).toList()
                    .size() / animals.stream().filter(a -> a.type().equals(Animal.Type.SPIDER)).toList().size();
            double dogsStatistic =
                (double) animals.stream().filter(a -> a.type().equals(Animal.Type.DOG) && a.bites()).toList().size()
                    / animals.stream().filter(a -> a.type().equals(Animal.Type.DOG)).toList().size();
            return spidersStatistic > dogsStatistic;
        }
    }

    //Найти самую тяжелую рыбку в 2-х или более списках -> Animal
    public static Optional<Animal> findHeaviestFish(List<Animal>... animalLists) {
        List<Animal> animals = Stream.of(animalLists).flatMap(List::stream).toList();
        return animals.stream()
            .filter(a -> a.type().equals(Animal.Type.FISH))
            .max(Comparator.comparing(Animal::weight));
    }

}
