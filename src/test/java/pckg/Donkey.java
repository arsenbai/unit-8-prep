package pckg;

public class Donkey extends Animal {
    private final String name;

    public Donkey(int age, double weight, String name) {
        super(age, weight);
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Donkey with name %s: age %d, weight %f\n",
                this.name,
                this.getAge(),
                this.getWeight());
    }
}
