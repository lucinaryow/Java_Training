package M4_Activity7;

public class Main {
		public static void main(String[] args) {
			BankAccountClass account = new BankAccountClass();

			BankAccountClass.runTest(() -> account.deposit(5000),"Deposit");
			BankAccountClass.runTest(() -> account.withdraw(3000), "Withdrawal");
			BankAccountClass.runTest(() -> account.deposit(-500), "Deposit");
			BankAccountClass.runTest(() -> account.withdraw(20000), "Withdrawal");
			BankAccountClass.runTest(() -> account.deposit(60000), "Deposit");
		}
}