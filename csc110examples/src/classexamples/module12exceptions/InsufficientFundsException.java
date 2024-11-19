package classexamples.module12exceptions;

public class InsufficientFundsException extends Exception {
	
	private double amount;

	public InsufficientFundsException(double amount) {
		super("Insufficient funds: Cannot withdraw $" + amount);
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
