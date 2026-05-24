package pckg;

import java.util.Objects;

public class Animal {
    private final int age;
    private final double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void eatFood() {
        System.out.println("Animal is eating food");
    }

    public void printInfo() {
        System.out.printf("My age is %d, my weight is %f\n", this.age, this.weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal a = (Animal) obj;
        return this.age == a.age && this.weight == a.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.weight);
    }
}
