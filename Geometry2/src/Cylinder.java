// class: Cylinder
// written by: Eli Dresnin
// date: Oct 10, 2022
// description: Cylinder object for Geometry 2 project. 
public class Cylinder {
	
	private double height;
	private Circle base;
	
	public Cylinder(double height, Circle base) {
		this.height = height;
		this.base = base;
	}
	
	public Cylinder() {
		this(1, new Circle(1));
	}

	public String toString() {
		return "Cylinder [height=" + height + ", base=" + base + "]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}
	
	// method name: getSurfaceArea
	// description: calculates of a cylinder 
	// parameters: none
	// return: surface area of cylinder
	public double getSurfaceArea() {
		return (2*Math.PI*Math.pow(getBase().getRadius(), 2)) * (2 * Math.PI * getBase().getRadius() * this.height);
		
	}
	// method name: getVolume
	// description: calculates volume of a cylinder
	// parameters: none
	// return: volume
	public double getVolume() {
		return 1.0/3.0*(Math.PI*Math.pow(getBase().getRadius(),2)*this.height);
	}
	
	

}
