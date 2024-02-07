// class: Cone
// written by: Eli Dresnin
// date: Oct 10, 2022
// description: Cone object for geometry 2 project. 
public class Cone {
	
	private double height;
	private Circle base;
	
	public Cone(double height, Circle base) {
		this.height = height;
		this.base = base;
	}
	
	public Cone() {
		this(1, new Circle(1));
	}

	public String toString() {
		return "Cone [height=" + height + ", base=" + base + "]";
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
	// description: Calculates surface area of a cone 
	// parameters: none
	// return: surface area of cone. 
	public double getSurfaceArea(){
		return Math.PI * getBase().getRadius()*(getBase().getRadius() + Math.sqrt(Math.pow(height, 2) + Math.pow(getBase().getRadius(), 2)));
	}
	// method name: getVolume
		// description: calculates volume of a cylinder
		// parameters: none
		// return: volume
	public double getVolume() {
		return 1.0/3.0*(Math.PI*Math.pow(getBase().getRadius(),2)*this.height);
	}
	

}
