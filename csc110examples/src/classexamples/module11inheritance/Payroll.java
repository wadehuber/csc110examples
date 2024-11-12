package classexamples.module11inheritance;

public class Payroll {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Rachel Washington", 101, 80000);
		HourlyEmployee emp2 = new HourlyEmployee("Derek Foster", 102, 45);
		emp2.setHoursWorked(75);
		Volunteer emp3 = new Volunteer("Maya Patel");
		
		System.out.println("emp1: " + emp1 + "  paid " + emp1.pay());
		System.out.println("emp2: " + emp2 + "  paid " + emp2.pay());
		System.out.println("emp3: " + emp3 + "  paid " + emp3.pay());

	}

}
