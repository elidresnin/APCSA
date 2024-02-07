import java.util.*;
public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			rectangles.add(new Rectangle(Math.random() * 10, Math.random()*10));
		}
		for(int i = 0; i < rectangles.size(); i++) {
			System.out.println(rectangles.get(i));
		}

	}

}
