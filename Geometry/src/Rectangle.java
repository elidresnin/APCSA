// class: Rectangle
// written by: Eli Dresnin
// date: Sep 20, 2022
// description: Rectangle object for geometry project
public class Rectangle {
	private double width;
	private double height;
	
	
	//Constructors
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	
	//Accessors and Modifier
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
	
	
	// method name: getArea
	// description: calculates area of a rectangle.
	// parameters: none
	// return: double - area of a rectangle 
	public double getArea() {
		return width * height;
	}
	
	// method name: getPerimeter
	// description: calculates perimeter of a rectangle 
	// parameters: none
	// return: perimeter of rectangle. 
	public double getPerimeter() {
		return 2 * (width + height);
	}
		

	
}
