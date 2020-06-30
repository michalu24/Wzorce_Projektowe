package _2_Builder_Cwiczenie_2;

public class Main {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik.Builder()
                .withName("Michał")
                .withSurname("Urbański")
                .withSalary(2500)
                .withYearsInCompany(1)
                .build();

    }
}
