package _1_Singleton;

/**
 * Lazy init defines creation in global access point,
 * Drawback -> it might cause problem in multi thread situation,
 */
public class Lazy {
    private static Lazy instance;

    private Lazy() {

    }

    public static Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
