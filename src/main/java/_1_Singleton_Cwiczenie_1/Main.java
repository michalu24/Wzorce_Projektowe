package _1_Singleton_Cwiczenie_1;

public class Main {
    public static void main(String[] args) {
        DBManager dbManager = DBManager.getInstance();
        dbManager.connect();
        dbManager.disconnect();
    }
}
