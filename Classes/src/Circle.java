// class: Circle
// written by: Eli Dresnin
// date: Sep 20, 2022
// description: a circle
public class Circle {
	
	private double radius;
	
	public Circle() {
		radius = 1.0;
		
	}
	
	public Circle(double r)  {
		radius = r;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
}
