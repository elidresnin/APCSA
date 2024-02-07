// class: GeometryMain
// written by: Eli Dresnin
// date: Sep 21, 2022
// description: Main for geometry project
import java.util.*;
public class GeometryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rectangle r = new Rectangle();
		Polygon p = new Polygon();

		int menu= 0;

		while (menu != 3) {
			System.out.println("Enter:");
			System.out.println("1 - Rectangle");
			System.out.println("2 - Polygon");
			System.out.println("3 - Exit");
			menu = s.nextInt();

			if (menu == 1) {
				System.out.println("enter length and width");
				r = new Rectangle(s.nextDouble(), s.nextDouble());
				System.out.println("Area = " + r.getArea());
				System.out.println("Perimeter = " + r.getPerimeter());

			}

			else ?if (menu == 2) {
				
				System.out.println("enter length and number of sides");
				p = new Polygon(s.nextInt(), s.nextDouble());
				System.out.println("Area = " +p.getArea());
				System.out.println("Perimeter = " + p.getPerimeter());

			}
			else {
				System.out.println("goodbye");
			}

		}






1=


















	}

}
