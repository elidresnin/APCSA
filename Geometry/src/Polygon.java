// class: Polygon
// written by: Eli Dresnin
// date: Sep 20, 2022
// description: Polygon object for geometry project
public class Polygon {
	
	private int sides;
	private double length;
	

	
	public Polygon(int sides, double length) {
		this.sides = sides;
		this.length = length;
	}
	
	public Polygon() {
		sides=4;
		length=4;
	}
	
	
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	
	
	// method name: getApothem
	// description: calculates the apothem of a polygon with the number of sides and side lengths provided by the user
	// parameters: none
	// return: double - apothem of polygon
	public double getApothem() {
		return length / (2 * Math.tan(Math.PI/sides));
	}

	// method name: getAera
	// description: calculates area of a polygon using getApothem function.
	// parameters: none
	// return: double - area of polygon 
	public double getArea() {
		return getApothem() * length * sides * .5;
	}

	// method name: getPerimeter
	// description: calculates perimeter of a polygon
	// parameters: none
	// return: double - perimeter of polygon.
	public double getPerimeter() {
		return sides * length;
	}



}
