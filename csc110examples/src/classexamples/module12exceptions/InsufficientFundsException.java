package classexamples.module12exceptions;

public class InsufficientFundsException extends Exception {
	
	private double balance;
	private double withdrawn;
	
	public InsufficientFundsException(double balance, double withdrawn) {
		super(String.format("Insuffient funcs: Cannot withdraw $%.2f", withdrawn));
		this.balance = balance;
		this.withdrawn = withdrawn;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawn() {
		return withdrawn;
	}
	
}
