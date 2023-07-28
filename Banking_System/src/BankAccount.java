public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing(double amount){
        if (amount>0){
        balance+=amount;
        System.out.println("The depositing process has been successfully completed, and your balance now "+ balance);}
        else{
        System.out.println("The deposit amount must be a positive number greater than zero, Please enter a valid amount");}
        }
    public void withdrawing(double amount){
        if (amount<balance){
            balance-=amount;
            System.out.println("The withdrawing process has been successfully completed, and your balance now "+ balance);}
        else{
            System.out.println("Please enter an amount within your available balance");}
    }
    }


