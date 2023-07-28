public class CheckingAccount extends Account{

    static private int totalChecksIssued; //total number of checks issued across all customers
    public CheckingAccount(long accountNumber, String accountHolderName, double balance, String accountStatus, int accountId) {
        super(accountNumber, accountHolderName, balance, accountStatus, accountId);
    }

    public static int getTotalChecksIssued() {
        return totalChecksIssued;
    }

    public void issuingChecks(double amount, String Name) {
        if (amount <= 0) {
            System.out.println("Invalid check amount, it's must be greater than 0");
        } else if (amount > getBalance()) {
            System.out.println("Check amount amount exceeds the account balance");
        } else {
            System.out.println("Issuing this check to " + Name + " for " + amount);
            totalChecksIssued++;
        }
    }

    public static void totalChecksIssued() {
        System.out.println("total number of checks issued across all customers "+ totalChecksIssued);
    }


}
