public class Square {

	private double length;

	

	public Square(double length) {

		this.length = length;

	}

	public Square() {

		this.length = 1.0;

	}

	public double getLength() {

		return length;

	}

	public void setLength(double length) {

		this.length = length;

	}

	public double getArea() {

		return length * length;

	}

	public double getPerimeter() {

		return 4 * length;

	}

	public String toString() {

		return "Square with side length = " + length;

	}

}