package videoexamples.classespt2.thisreference;

public class ThisReference {
	
	String name;
	int age;
	Double score;
	
	public ThisReference(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public ThisReference(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		score = 0.0;
	}

	@Override
	public String toString() {
		return "ThisReference [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
