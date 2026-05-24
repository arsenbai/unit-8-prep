package pckg;

/**
 * Abstract class of Animal for extending other subclasses.
 */
abstract class AbstractAnimal {
    /**
     * Number of animal's legs.
     */
    private int numberOfLegs;

    /**
     * Number of animal's wings.
     */
    private int numberOfWings;

    /**
     * Number of animal's tails.
     */
    private int numberOfTails;

    abstract void eat();

    void sleep() {
        System.out.println("I am sleeping");
    };

    abstract void sound();

}
