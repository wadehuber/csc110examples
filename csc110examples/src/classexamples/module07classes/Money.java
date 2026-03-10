package classexamples.module07classes;

public class Money {

	int amount;
	String currency;
	
	public Money(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}
	
}
