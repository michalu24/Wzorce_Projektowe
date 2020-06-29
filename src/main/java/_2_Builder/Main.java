package _2_Builder;

public class Main {
    public static void main(String[] args) {

        //More clearer and more readable code thanks to Builder :D

        BankAccount account = new BankAccount.Builder(123124142)
                .withOwner("Michał")
                .withBalance(1200.20)
                .withBranch("Branch1")
                .withInerestRate(20.0)
                .build();

        System.out.println(account.toString());
    }
}
