public class BasicAccount extends Account{
    private final double withdrawalLimit;

    public BasicAccount (int accountNumber,double withdrawalLimit) {
        super(accountNumber);
        this.withdrawalLimit = withdrawalLimit > 0 ? withdrawalLimit : 0;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the deposit amount to the balance
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public double Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0; // Invalid withdrawal amount
        }

        // Determine the maximum allowable withdrawal
        double allowableWithdrawal = Math.min(amount, Math.min(balance, withdrawalLimit));

        balance -= allowableWithdrawal; // Deduct the allowable amount
        return allowableWithdrawal; // Return the actual withdrawn amount
    }
}
