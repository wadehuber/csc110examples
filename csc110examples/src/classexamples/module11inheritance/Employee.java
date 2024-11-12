package classexamples.module11inheritance;

public class Employee {

	private String name;
	private int empNo;
	protected double salary;
	
	public Employee(String name, int empNo, double salary) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmpNo() {
		return empNo;
	}
	
	public double pay() {
		return salary / 26;  // Pay every 2 weeks
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + ", salary=" + salary + "]";
	}
	
}
