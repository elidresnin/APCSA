
public class Rectangle extends Square {
	private double width;
	
	public Rectangle(double length, double width) {
		super(length);
		this.width = width;
	}
	
	public Rectangle() {
		this(1,2);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return super.getLength() * width;
	}
	public double getPerimeter() {
		return (2 * super.getLength())+(2 * width);

	}

	@Override
	public String toString() {
		return "Rectangle [width = " + width + ", Length = " + super.getLength() + "]";
	}
	
	
}
