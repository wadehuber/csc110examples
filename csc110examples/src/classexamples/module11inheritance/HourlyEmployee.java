package classexamples.module11inheritance;

public class HourlyEmployee extends Employee {
	
	private int hoursWorked;

	public HourlyEmployee(String name, double salary) {
		super(name, salary);
		this.hoursWorked = 0;
	}
	
	public double pay() {
		double pay = getSalary() * hoursWorked;
		hoursWorked = 0;
		return pay;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + " hoursWorked=" + hoursWorked + "]";
	}
}
