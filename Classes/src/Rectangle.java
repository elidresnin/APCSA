// class: Rectangle
// written by: Eli Dresnin
// date: Sep 19, 2022
// description: implementation for a rectangle
public class Rectangle {

	//characteristics, properties, instacne fields, instance variables
	
	private double height; //always public, never assign a value.
	private double width; 
	
	//constructors - these methods are used to create a instance of the rectangle class
	
	//default constructor - no parameters used to set the properties to default values
	public Rectangle() {
		height = 1.0;
		width = 1.0;
	}
	
	public Rectangle(double sideLength)  {
		height = sideLength;
		width = sideLength;
	}
	//packed constructor - has a parameter for each instance field
	
	public Rectangle(double h, double w) {
		height = h;
		width = w;
		
	}
	
	
	
	//methods
	// modifiers -  change a property
	// setters, mutators
	
	

	public void setHeight(double h) {
		height = h;
		
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", getArea()=" + getArea() + ", getPerimeter()="
				+ getPerimeter() + "]";
	}

	public void setWidth(double w) {
		width = w;
	}

	//accessors, getters - tells you a property's value
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public double getPerimeter() {
		return height * 2 + width * 2;
	}
	
}
