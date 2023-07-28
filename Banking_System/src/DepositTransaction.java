public class DepositTransaction extends Transaction{

    public DepositTransaction(double balance, double amount) {
        super(balance, amount);
    }

    @Override
    public void performingTransaction() {
        balance+=amount;
        System.out.println("Performing deposit transaction and your balance is " + balance);
    }
}
