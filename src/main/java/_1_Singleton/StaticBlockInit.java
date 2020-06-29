package _1_Singleton;

/**
 * Static bloc init is similar to Eager init, although it allows
 * exception handling.
 * Drawback -> same one as in Eager, creating instance even though
 * client might not use it
 */
public class StaticBlockInit {
    private static StaticBlockInit instance;

    private StaticBlockInit() {

    }

    static {
        try {
            instance = new StaticBlockInit();
        } catch (Exception e) {
            throw new RuntimeException("się zjebało");
        }
    }

    public static StaticBlockInit getInstance() {
        return instance;
    }
}
