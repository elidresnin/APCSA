import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Triangle extends Shape {
	
	private int sideLength;
	private int height;
	
	public Triangle() {
		this(0,0,Color.BLUE, 10,10);
	}
	//x_coordinate and y_coordinate are the coordiantes of the bottom left point in the triangle
	public Triangle(int x_coordinate, int y_coordinate, Color color, int sideLength,int height){
		super(x_coordinate, y_coordinate, color); 						// Initial coordinates for the Shape.
		this.sideLength = sideLength;
		this.height = height;
	}
	
	 public void move() {
		 setY(getY()+4);
		 setX(getX()+4);
	}


	@Override
	public int clicked() {
		clicked = true;
		return 2;
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(getColor());
		g2.fillPolygon(new int[] {getX(),getX()+sideLength/2,getX()+sideLength}, new int[] {getY(),getY()-height,getY()}, 3);
	}

	@Override
	public boolean contains(int x, int y) {
		return new Polygon(new int[] {getX(),getX()+sideLength/2,getX()+sideLength},new int[] {getY(),getY()-height,getY()},3).contains(x, y);
	}

}
