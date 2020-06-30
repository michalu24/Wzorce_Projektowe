package _2_Builder_Cwiczenie_2;

public class Pracownik {
    private String name;
    private String surname;
    private int salary;
    private int yearsInCompany;

    public static class Builder {
        private String name;
        private String surname;
        private int salary;
        private int yearsInCompany;

        public Builder() {

        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;

        }

        public Builder withSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder withYearsInCompany(int yearsInCompany) {
            this.yearsInCompany = yearsInCompany;
            return this;
        }

        public Pracownik build() {
            Pracownik pracownik = new Pracownik();
            pracownik.name = this.name;
            pracownik.surname = this.surname;
            pracownik.salary = this.salary;
            pracownik.yearsInCompany = this.yearsInCompany;

            return pracownik;

        }

    }

    private Pracownik() {

    }
}
