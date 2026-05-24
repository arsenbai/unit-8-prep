package pckg;

public class Monkey extends Animal {
    private final String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }

    public void eatFood() {
        System.out.printf("This monkey loves %s\n", this.foodType);
    }
}
