public class Main {
 public static void main(String[] args) {

  System.out.println("This is related to BankAccount Class");
  BankAccount bankAccount1 = new BankAccount(344567665, "Ahmad Ibrahim", 10000.3);
  bankAccount1.depositing(1000);
  bankAccount1.withdrawing(500);
  System.out.println();

  System.out.println("This is related to SavingAccount Class");
  SavingAccount savingAccount1 = new SavingAccount(99704234, "Eman Ahmad", 4000, "active", 10);
  savingAccount1.setAccountStatus("blocked");
  savingAccount1.accountTransactions("depositing", 1000);
  savingAccount1.printAccountDetails();
  double interest = savingAccount1.calculateInterest();
  System.out.println(interest);
  System.out.println();

  System.out.println("This is related to CheckingAccount Class");
  CheckingAccount checkingAccount1 = new CheckingAccount(23435454, "Alaa Ahmad", 100000, "active", 456);
  checkingAccount1.issuingChecks(10000,"Reham");
  CheckingAccount.totalChecksIssued();
  System.out.println();

  System.out.println("This is related to Bank Class");
  Bank user1= new Bank(35679909,"Menna Mohamed",8000);
  user1.creatingAccounts();
  user1.depositing(7000);
  user1.withdrawing(3000);
  user1.viewingBalances(35679909);
  System.out.println();

  Bank user2= new Bank(796077298,"Mai Mohamed",0);
  user2.creatingAccounts();
  user2.withdrawing(3000);
  user2.viewingBalances(796077298);


 }
}