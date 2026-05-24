package utils;

import pckg.Animal;

import java.util.List;

public class AnimalsFilter {
    public static List<Animal> filterByAge(List<Animal> animals, int minAge) {
        return animals.stream()
                .filter((animal -> animal.getAge() > minAge)).toList();
    }
}
