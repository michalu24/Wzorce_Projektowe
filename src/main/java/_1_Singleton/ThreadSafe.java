package _1_Singleton;

/**
 * Bellow ThreadSafe init allows safty with thread situation,
 * Drawback -> reduces efficiency
 */

public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {

    }

    public static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }
}
