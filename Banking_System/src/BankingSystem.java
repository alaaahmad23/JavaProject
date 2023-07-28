public interface BankingSystem {

    public void creatingAccounts();

    public void depositing(long accountNumber, double amount);

    public void withdrawing(long accountNumber, double amount);

    public void viewingBalances(long accountNumber);
}

