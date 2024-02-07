import java.util.ArrayList;

public class InheritanceMain {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		
		Square s2 = new Rectangle();
		
		((Rectangle)s2).getLength();
		
		ArrayList<Object> shapes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++ ) {
			int ra = ((int)(Math.random() *2) *3);
			if (ra == 0) {
				shapes.add(new Square());
			}
			else if (ra == 1){
				shapes.add(new Rectangle());
			}
			else {
				shapes.add(new Object());
			}
			
		}
		
		
		
		for (int i = 0; i < 10; i++ ) {
			if(shapes.get(i) instanceof Square) {
				((Square)shapes.get(i)).setLength(5);
			}
			else if(shapes.get(i) instanceof Rectangle) {
				((Rectangle)shapes.get(i)).setWidth(10);
			}
		}
		
		
		
		
		 
		
		 for(Object sq: shapes) {
			 System.out.println(sq);
		 }
		 
		 for(Object sq: shapes) {
				if(sq instanceof Square) {
					System.out.println("Area = " + ((Square) (sq)).getArea());
			}
		 }
	
		
		System.out.println(s2);
		System.out.println(r);
	}

}
