package classexamples.module11inheritance;

public class Employee {
	
	private String name;
	private int empNo;
	private static int empCount = 0;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		empCount ++;
		empNo = empCount + 1000;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double pay() {
		return salary / 26;  // Pay every 2 weeks
	}

	@Override
	public String toString() {
		return "Employee [Name=" + getName() + ", Employee #" + getEmpNo() + ", salary=" + salary + "]";
	}
	
}
