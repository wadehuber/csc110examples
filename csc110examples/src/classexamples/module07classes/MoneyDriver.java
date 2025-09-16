package classexamples.module07classes;

public class MoneyDriver {

	public static void main(String[] args) {
		Money bill = new Money(500, "Dollars");
		Money coin = new Money(25, "Dollars");
		
		System.out.println(bill);
		System.out.println(coin);

	}

}
