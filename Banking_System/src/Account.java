import java.net.SocketOption;

public class Account extends BankAccount {

    private String accountStatus;
    private int accountId;

    public Account(long accountNumber, String accountHolderName, double balance, String accountStatus, int accountId) {
        super(accountNumber, accountHolderName, balance);
        this.accountStatus = accountStatus;
        this.accountId = accountId;
    }


    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getAccountId() {
        return accountId;
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name:" + getAccountHolderName());
        System.out.println("Account balance: " + getBalance());
        System.out.println("Account ID: " + getAccountId());
        System.out.println("Account Status: " + getAccountStatus());
    }

    public void accountTransactions(String transactionsType, double amount) {

        if (transactionsType.equalsIgnoreCase("depositing")) {
            System.out.println("The transaction process is Depositing");
            depositing(amount);
        } else if (transactionsType.equalsIgnoreCase("withdrawing")) {
            System.out.println("The transaction process is Withdrawing");
            withdrawing(amount);
        } else {
            System.out.println("Invalid transaction type, enter 'depositing' or 'withdrawing'");
        }


    }
}

