package classexamples.module12exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("AZ10001", 1000.00);
		double[] values = {100.00, -20.00, 2000.00};
		
		System.out.println("Bank account: " + account);
		
		for (double value : values) {
			System.out.println();
			try {
				System.out.println("Withdraw $" + value);
				account.withdraw(value);
				System.out.println("    Bank account: " + account);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid amount " + e.getMessage());
			} catch (InsufficientFundsException e) {
				System.out.println("Unable to withdraw $" + e.getAmount());
				System.out.println("Transaction FAILED " + e.getMessage());
			}
		}

	}

}
