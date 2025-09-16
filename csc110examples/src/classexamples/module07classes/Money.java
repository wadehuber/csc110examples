package classexamples.module07classes;

public class Money {
	
	int amount;   // this is in "cents", not dollars
	String currency;
	
	// Constructor 
	public Money(int a, String c) {
		super();
		amount = a;
		currency = c;
	}

	@Override
	public String toString() {
		if (amount >= 100) {
			return "Money [amount=" + amount/100 + ", currency=" + currency + "]";
		}
		else {
			return "Money [amount=" + amount + ", currency=Cents" + "]";
		}

	}
	
}
