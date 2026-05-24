package pckg;

import java.util.List;

public class Zoo {
    String city;
    List<Animal> listOfAnimals;

    public Zoo(String city, List<Animal> listOfAnimals) {
        this.city = city;
        this.listOfAnimals = listOfAnimals;
    }

    public void printAnimals() {
        System.out.printf("In %s zoo we have animals:\n", this.city);
        for (Animal animal : listOfAnimals) {
            animal.printInfo();
        }
    }

    public void feedAnimals() {
        System.out.printf("Let's feed animals in %s Zoo!", this.city);
        for (Animal animal : listOfAnimals) {
            animal.eatFood();
        }
    }

    public List<Animal> getListOfAnimals() {
        return this.listOfAnimals;
    }

    public String getCity() {
        return this.city;
    }
}
