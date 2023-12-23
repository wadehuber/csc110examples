package videoexamples.classespt1.die;

public class Die {
	
	private int numberOfSides;   // maximum face value (number of sides)
	private int faceValue;       // current value showing on the die
	
	//-----------------------------------------------------------------
	//  Default Constructor: Sets the number of sides to 6
	//-----------------------------------------------------------------
	public Die() {
		this(6);
	}
	
	//-----------------------------------------------------------------
	//   Constructor: Sets the number of sides to numFaces
	//-----------------------------------------------------------------
	public Die(int numFaces) {
		numberOfSides = numFaces;
		setFaceValue(1);
	}
	
	//-----------------------------------------------------------------
	//   Accessors & mutators
	//-----------------------------------------------------------------
	public int getNumberOfSides() {
		return numberOfSides;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public void setFaceValue(int value) {
		if (value > 0 && value <= numberOfSides) {
			this.faceValue = value;
		}
	}
	
	//-----------------------------------------------------------------
	//   Create a new face value and returns the result
	//-----------------------------------------------------------------
	public int roll() {
		setFaceValue((int)(Math.random() * numberOfSides) + 1);
		return faceValue;
	}

	@Override
	public String toString() {
		return "[" + faceValue + "]";
	}

}






