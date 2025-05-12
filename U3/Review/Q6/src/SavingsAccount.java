public class SavingsAccount implements Account {

    double balance;
    double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void intrest() {
        balance *= (1 + interestRate);
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}
