import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{

	private int width;
	private int[] vector = new int[] {(int)(Math.random()*5)+1,(int)(Math.random()*5)+1};

	

	public Circle() {
		this(0,0,Color.red,10);
	}
	public Circle(int x_coordinate, int y_coordinate, Color color,int width) {
		super(x_coordinate,y_coordinate,color);
		this.width = width;	
		
	
		clicked = false;
	}
	
	@Override
	public int clicked() {
		clicked = true;
		return Math.abs((vector[0] + vector[1])/2);
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(getColor());
		g2.fillOval(getX(), getY(), width, width);
		
	}

	@Override
	public boolean contains(int x, int y) {
		return new Ellipse2D.Double(getX(),getY(),width,width).contains(x, y);
	}
	@Override
	public void move() {
		setY(getY()+vector[1]);
		setX(getX()+vector[0]);
		
		if(getY() > 480-width || getY() < 0)
			vector[1] *= -1;
		if(getX() > 800-width || getX() < 0)
			vector[0] *= -1;
		
	}

}
