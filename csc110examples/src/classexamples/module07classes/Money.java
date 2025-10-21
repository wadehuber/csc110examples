package classexamples.module07classes;

public class Money {
	
	int amount;   // this is "cents", not "dollars"
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
		if (amount >= 100) {
			return "Money [amount=" + amount/100 + ", currency=" + currency + "]";
		}
		else {
			return "Money [amount=" + amount + ", currency=" + currency + "]";
		}
	}
	
	

}
