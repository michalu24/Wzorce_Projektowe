package _1_Singleton_Cwiczenie_1;

public class DBManager {
    private static DBManager instance ;

    private DBManager() {

    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database");

    }
    public void disconnect() {
        System.out.println("Disconnected from Database");

    }
}
