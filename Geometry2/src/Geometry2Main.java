import java.util.*;
public class Geometry2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		Circle c = new Circle();
		Cylinder cy = new Cylinder();
		Cone co = new Cone();	

		int menu = 0;

		while (menu != 4) {
			System.out.println("Enter:");
			System.out.println("1 - Circle");
			System.out.println("2 - Cylinder");
			System.out.println("3 - Cone");
			System.out.println("4 - Exit");
			menu = s.nextInt();

			if (menu == 1) {
				System.out.println("enter radius");
				c.setRadius(s.nextDouble());
				System.out.println("area = " +c.getArea());
				System.out.println("circumferece = " + c.getCircumference());
			}

			else if (menu == 2) {
				System.out.println("enter base:");
				cy.getBase().setRadius(s.nextDouble());
				System.out.println("enter height");
				cy.setHeight(s.nextDouble());
				System.out.println("surface area = " +cy.getSurfaceArea());
				System.out.println("volume = " + cy.getVolume());


			}
			else if (menu == 3) {
				System.out.println("enter base:");
				co.getBase().setRadius(s.nextDouble());
				System.out.println("enter height");
				co.setHeight(s.nextDouble());
				System.out.println("surface area = " +co.getSurfaceArea());
				System.out.println("volume = " + co.getVolume());
			}
			else {
				System.out.println("goodbye");
			}



		}
	}

}
