package classexamples.module11inheritance;

public class HourlyEmployee extends Employee {
	
	private int hoursWorked;

	public HourlyEmployee(String name, int empNo, double salary) {
		super(name, empNo, salary);
		this.hoursWorked = 0;
	}
	
	public double pay() {
		double pay = salary * hoursWorked;
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
		return "HourlyEmployee [name=" + getName()
				+ ", empNo=" + getEmpNo()
				+ ", salary=" + salary + "/hr"
				+ ", hours worked=" + hoursWorked + "]";
	}
	
}
