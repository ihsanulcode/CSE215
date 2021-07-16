
public class Box {
	private double width, height, depth;

	Box() {

	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box(double val) {
		width = height = depth = val;
	}

	Box(Box obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}

	public double volume() {
		return width * height * depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

}
