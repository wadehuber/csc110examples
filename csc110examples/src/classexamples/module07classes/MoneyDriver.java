package classexamples.module07classes;

public class MoneyDriver {

	public static void main(String[] args) {
		Money fiveDollarBill = new Money(5, "Dollars");
		Money quarter = new Money(25, "Cents");
		Money account = new Money(100, "Euros");
		
		System.out.println(fiveDollarBill);
		System.out.println(quarter);
		System.out.println(account);

	}

}
