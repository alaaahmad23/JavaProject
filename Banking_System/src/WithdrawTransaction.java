public class WithdrawTransaction extends Transaction {
    public WithdrawTransaction(double balance, double amount) {
        super(balance, amount);
    }

    @Override
    public void performingTransaction() {
        balance-=amount;
        System.out.println("Performing withdraw transaction and your balance is " + balance);
    }
}
