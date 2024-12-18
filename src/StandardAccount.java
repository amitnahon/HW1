public class StandardAccount extends Account{
    private final double creditLimit;

    //Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = creditLimit < 0 ? creditLimit : 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the deposit to the balance
        }
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) {
            return 0; //checks to see if I have enough balance in the account, if not doesn't let you withdrawal
        }

        double maxWithdrawal = balance - creditLimit; // Maximum allowable withdrawal
        if (amount > maxWithdrawal) {
            balance -= maxWithdrawal; // Withdraw only up to the maximum allowable amount
            return maxWithdrawal;
        } else {
            balance -= amount; // Withdraw the requested amount
            return amount;
        }
    }
}
