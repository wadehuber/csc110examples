package videoexamples.classespt1.pen;

public class FourColorPen {
	
	private final static String colors[] = {"NONE", "BLACK", "BLUE", "GREEN", "RED"};
	
	private int color;
	
	public FourColorPen() {
		super();
		color = 0;
	}

	public void click(String c) {
		color = getColorIndex(c);
	}
	
	private int getColorIndex(String c) {
		for (int ii=0;ii<colors.length;ii++) {
			if (c.toUpperCase().equals(colors[ii]))
				return ii;
		}
		return 0;
	}
	
	public void write(String msg) {
		if (color != getColorIndex("NONE")) {
			System.out.println("<" + colors[color] + ">" + msg + "<" + colors[color] + ">");
		}
	}

	@Override
	public String toString() {
		return "FourColorPen [color=" + colors[color] + "]";
	}
}
