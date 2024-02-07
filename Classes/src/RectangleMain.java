import java.util.*;

public class RectangleMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Rectangle[] rects = new Rectangle[5];
		
		for(int i = 0; i < rects.length; i++) {
			System.out.println("Enter length and width");
			rects[i] = new Rectangle(s.nextDouble(), s.nextDouble());
		}
		
		

		for(int i = 0; i < rects.length; i++) {
			rects[i].setHeight( rects[i].getHeight() * rects[i].getHeight()) ;
			
		}
		
		
		
		
		
		
		
//		Rectangle r = new Rectangle(); 
//		Rectangle t = new Rectangle(10.0, 10.0); 
//		
//		
//		System.out.println("Enter the height and width of the rectangle");
//		r.setHeight(s.nextDouble());
//		r.setWidth(s.nextDouble());
//		
//		System.out.println("rectangle r has a height of " + r.getHeight() + " and a width of " + r.getWidth());
//		
//		System.out.println();

	}

}
