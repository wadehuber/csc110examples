package classexamples.module11inheritance;

public class Volunteer extends Employee {

	public Volunteer(String name) {
		super(name, 0);
		
	}
	
	@Override
	public String toString() {
		return "Volunteer [name=" + getName() + ", empNo=" + getEmpNo() + "]";
	}

}
