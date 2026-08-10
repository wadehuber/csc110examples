package otherexamples;

public class ClassTerminology {
	private String label;
	private int num;

	public ClassTerminology() {
		this.label = "Unknown";
		this.num = 0;
	}

	public ClassTerminology(String label, int num) {
		this.label = label;
		this.num = num;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void printClassTerminology() {
		System.out.println("printClassTerminology [label=" + label + ", num=" + num + "]");
	}

	@Override
	public String toString() {
		return "ClassTerminologyObject [label=" + label + ", num=" + num + "]";
	}

	public static void main(String[] args) 
	{
		ClassTerminology obj1 = new ClassTerminology("SampleObjectA", 10);
		ClassTerminology obj2 = new ClassTerminology("SampleObjectB", 42);
		
		obj1.printClassTerminology();
		System.out.println(obj2);
		
	}

}
