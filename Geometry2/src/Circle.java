// class: Circle
// written by: Eli Dresnin
// date: Oct 10, 2022
// description: circle object for geometry 2. 
public class Circle {
	
	private double radius; 
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this(1.0);
	}
	
	public String toString() {
		return ("circle radius = " + radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// method name: getArea
	// description: gets Area of a circle
	// parameters: radius
	// return: area of circle
	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	}
	
	// method name: getCircumfernce
	// description: calculates cricumference of a circle 
	// parameters: radius 
	// return: circumference of circle
	public double getCircumference() {
		return 2*this.radius*(Math.PI);
	}
	
	
}
