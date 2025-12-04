package classexamples.module11inheritance;

public class Payroll {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Rachel Washington", 80000);
		Volunteer emp2 = new Volunteer("Margaret Simpson");
		HourlyEmployee emp3 = new HourlyEmployee("Kenny Southpark", 16);
		emp3.setHoursWorked(20);
		emp3.addHoursWorked(20);
		
		
		System.out.print(emp1 + " paid $");
		System.out.printf("%.2f", + emp1.pay());
		System.out.println();
		
		System.out.print(emp2 + " paid $");
		System.out.printf("%.2f", + emp2.pay());
		System.out.println();
		
		System.out.print(emp3 + " paid $");
		System.out.printf("%.2f", + emp3.pay());
		System.out.println();
		
		System.out.println();
		System.out.println();
		System.out.println("Company payroll:");
		HourlyEmployee emp4 = new HourlyEmployee("Anne Elliot", 22);
		emp4.setHoursWorked(32);

		Employee[] company = {
				emp1, 
				emp2, 
				emp3,
				new Employee("Frederick Wentworth", 120000),
				emp4,
				new Volunteer("Lady Russell"),
		};
		

		for (Employee e : company) {
			System.out.print("   " + e + " paid $");
			System.out.printf("%.2f", + e.pay());
			System.out.println();
		}
	
		
		
		
	}

}
