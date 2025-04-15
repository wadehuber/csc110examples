package classexamples.module11inheritance;

public class Payroll {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Rachel Waashington", 80000);

		HourlyEmployee emp2 = new HourlyEmployee("Chicken Joe", 17.15);
		emp2.setHoursWorked(25);
		
		Volunteer emp3 = new Volunteer("Harry Potter");
		
		
		System.out.println("emp1: " + emp1 + " paid " + emp1.pay());
		System.out.println("emp2: " + emp2 + " paid " + emp2.pay());
		System.out.println("emp3: " + emp3 + " paid " + emp3.pay());
		
		// Polymorphism example
		System.out.println();
		System.out.println("Company E");
		Employee[] company = {
				new Employee("Elizabeth Sorenson", 120000),
				new Volunteer("Jason Wentworth"),
				new HourlyEmployee("Thailia Elliot", 25),
				new HourlyEmployee("Leo Bertram", 15),
				new Employee("Reyna Lucas", 75000)
		};
		for (Employee e : company) {
			System.out.println(e + " paid " + e.pay());
		}
		
	}

}
