public abstract class Transaction {

    protected double balance;
    protected double amount;
    public Transaction(double balance,double amount){
        this.balance=balance;
        this.amount=amount;
    }
    public abstract void performingTransaction();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

