package classexamples.module11inheritance;

public class Volunteer extends Employee {
	
	private int totalVolunteerHours = 0;

	public Volunteer(String name) {
		super(name, 0);
	}

	public int getTotalVolunteerHours() {
		return totalVolunteerHours;
	}

	public void addHoursWorked(int totalVolunteerHours) {
		this.totalVolunteerHours += totalVolunteerHours;
	}

	@Override
	public String toString() {
		return "Volunteer [Name=" + getName() + ", Employee #" + getEmpNo() + "]";
	}
	
}
