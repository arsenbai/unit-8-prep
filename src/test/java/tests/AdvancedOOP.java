package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pckg.*;
import utils.AnimalsFilter;

import java.util.ArrayList;
import java.util.List;

public class AdvancedOOP extends BaseTest {
    @Test
    public void classHierarchyTest() {
        Animal animal = new Animal(2, 33f);
        Monkey monkey = new Monkey(1, 15f, "Banana");
        Donkey donkey = new Donkey(1, 22d, "John");
        Assert.assertTrue(monkey instanceof Animal);
        Assert.assertTrue(donkey instanceof Animal);
        animal.eatFood();
        animal.printInfo();
        monkey.eatFood();
        monkey.printInfo();
        donkey.eatFood();
        donkey.printInfo();
    }

    @Test
    public void managementLogicTest() {
        Zoo zoo = new Zoo("Astana", List.of(
                new Animal(2, 22d),
                new Animal(3, 22d),
                new Animal(4, 22d),
                new Animal(5, 22d)
                ));
        zoo.printAnimals();
        zoo.feedAnimals();
        List<Animal> filteredAnimals = AnimalsFilter.filterByAge(zoo.getListOfAnimals(), 3);
        Assert.assertEquals(filteredAnimals,
                List.of(
                        new Animal(4, 22d),
                        new Animal(5, 22d)
                ));
    }

    @Test
    public void integrationAndTestingTest() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(2, 22d));
        animals.add(new Monkey(4, 33d, "Banana"));
        animals.add(new Monkey(22, 44d, "Bamboo"));
        animals.add(new Donkey(10, 14d, "Donny"));
        animals.add(new Donkey(1, 1.5d, "Little"));

        Zoo newYorkZoo = new Zoo("New York", animals);
        newYorkZoo.printAnimals();
        newYorkZoo.feedAnimals();

        List<Animal> filteredAnimals = AnimalsFilter.filterByAge(
                newYorkZoo.getListOfAnimals(),
                10);

        Zoo filteredZoo = new Zoo("City of grown-up animals", filteredAnimals);
        filteredZoo.printAnimals();

        List<Zoo> zoos = new ArrayList<Zoo>(
                List.of(newYorkZoo, filteredZoo)
        );
        List<Zoo> selectedZoos = zoos.stream()
                .filter(zoo -> zoo.getCity().contains("York")).toList();
        for (Zoo zoo : selectedZoos) {
            zoo.printAnimals();
        }
    }
}
