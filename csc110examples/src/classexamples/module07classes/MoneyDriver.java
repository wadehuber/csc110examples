package classexamples.module07classes;

public class MoneyDriver {

	public static void main(String[] args) {
		Money fiveDollarBill = new Money(500, "Dollars");
		Money quarter = new Money(25, "Cents");
		Money wrong = new Money(9342, "Blerkins");
		
		System.out.println(fiveDollarBill);
		System.out.println(quarter);
		System.out.println(wrong);

	}

}
