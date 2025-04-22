package classexamples.module12exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("AZ10001", 1000.00);
		double[] values = {100.00, -20.00, 2000.00};
		
		System.out.println("Bank account: " + account);
		
		for (double value : values) {
			System.out.println();
			System.out.println("Withdraw $" + value);
			try {
				account.withdraw(value);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
				System.out.println("Current balance: " + e.getBalance());
			}
			finally {
				System.out.println("Thank you for banking with us!");
			}
			System.err.println("    Bank account: " + account);
		}

	}

}
