package _2_Builder;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public static class Builder {
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder withBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder withBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder withInerestRate(double inerestRate) {
            this.interestRate = inerestRate;
            return this;
        }

        public BankAccount build() {
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;

        }
    }

    private BankAccount() {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
