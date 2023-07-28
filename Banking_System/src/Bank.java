public class Bank extends BankAccount implements BankingSystem{
    public Bank(long accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void creatingAccounts() {
        System.out.println("your account have been created");
    }

    @Override
    public void depositing(long accountNumber, double amount) {
     depositing(amount);
    }

    @Override
    public void withdrawing(long accountNumber, double amount) {
     withdrawing(amount);
    }

    @Override
    public void viewingBalances(long accountNumber) {
        System.out.println("The balance in this account number "+ accountNumber +" is $"+ getBalance());

    }
}
