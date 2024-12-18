public abstract class Account implements IAccount {

    //state
    protected int accountNumber;
    protected double balance;

    //constructor
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    //Behavior
    @Override
    public abstract void Deposit(double amount);

    @Override
    public abstract double Withdraw(double amount);

    @Override
    public double GetCurrentBalance() {
        return this.balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}