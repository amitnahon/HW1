public class PremiumAccount extends Account {

    public PremiumAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the deposit amount to the balance
        }
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0; // Invalid withdrawal amount
        }

        balance -= amount; // Deduct the requested amount, allowing for negative balance
        return amount;
    }
}
