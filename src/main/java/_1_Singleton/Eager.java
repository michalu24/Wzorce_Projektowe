package _1_Singleton;

/**
 * Eager init is the simplest way to create singleton
 * Drawback -> instance is created even though client might
 * not be using it,
 * Drawback -> no exception handling,
 */

public class Eager {

    //one private static field of instance
    private static final Eager instance = new Eager();

    //Assurance that there would not be access to constructor
    private Eager() {

    }

    //Global access point to singleton
    public static Eager getInstance() {
        return instance;
    }
}
