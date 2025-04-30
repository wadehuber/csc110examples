package classexamples.module12exceptions;

public class BankAccount {
	
	private double balance;
	private String accountNumber;
	
	public BankAccount(String accountNumber, double startingBalance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = startingBalance;
	}
	
	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal must be greater than $0.00");
		}
		if (amount > balance) {
			throw new InsufficientFundsException(balance, amount);
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
	

}
