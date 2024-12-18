import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {
    private List<IAccount> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        if (account != null) {
            accounts.add(account);
        }
}

    @Override
    public void CloseAccount(int accountNumber) {
        IAccount accountToClose = null;

        // Find the account
        for (IAccount account : accounts) {
            if (account.GetAccountNumber() == accountNumber) {
                accountToClose = account;
                break;
            }
        }

        // Remove or print a message
        if (accountToClose != null) {
            if (accountToClose.GetCurrentBalance() >= 0) {
                accounts.remove(accountToClose);
            } else {
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return new ArrayList<>(accounts); // Return a copy of the list to avoid external modification
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }
        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> accountsWithBalance = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.GetCurrentBalance() > balanceAbove) {
                accountsWithBalance.add(account);
            }
        }
        return accountsWithBalance;
    }
}