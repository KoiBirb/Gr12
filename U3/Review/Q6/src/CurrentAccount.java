public class CurrentAccount implements Account{

    double balance;


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
        balance *= 1.01;
    }

    @Override
    public double viewBalance() {
        return balance;
    }
}
