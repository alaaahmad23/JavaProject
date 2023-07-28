public class SavingAccount extends Account{

    final private double interestRate=0.14;
    public SavingAccount(long accountNumber, String accountHolderName, double balance, String accountStatus, int accountId) {
        super(accountNumber, accountHolderName, balance, accountStatus, accountId);
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
