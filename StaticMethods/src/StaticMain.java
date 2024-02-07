// class: staticMain
// written by: Eli Dresnin
// date: Oct 21, 2022
// description: main for static methods project
import java.util.*;
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the 3 sides of your triangle");
		double side1 = s.nextDouble();
		double side2 = s.nextDouble();
		double side3 = s.nextDouble();
		
		if(Triangle.acuteTriangle(side1, side2, side3) && Triangle.scaleneTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a acute scalene triangle");
		}
		
		else if(Triangle.acuteTriangle(side1, side2, side3) && Triangle.isoscelesTriangle(side1, side2, side3)&& Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a acute isosceles triangle");
		}
		
		else if(Triangle.acuteTriangle(side1, side2, side3) && Triangle.equilateralTriangle(side1, side2, side3)&& Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a acute equilateral triangle");
		}
		
		else if(Triangle.obtuseTriangle(side1, side2, side3) && Triangle.scaleneTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a obtuse scalene triangle");
		}
		
		else if(Triangle.obtuseTriangle(side1, side2, side3) && Triangle.isoscelesTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a obtuse isosceles triangle");
		}
		else if(Triangle.obtuseTriangle(side1, side2, side3) && Triangle.equilateralTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a obtuse equilateral triangle");
		}
		
		else if(Triangle.rightTriangle(side1, side2, side3) && Triangle.scaleneTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a right scalene triangle");
		}
		
		else if(Triangle.rightTriangle(side1, side2, side3) && Triangle.isoscelesTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a right isosceles triangle");
		}
		
		else if(Triangle.rightTriangle(side1, side2, side3) && Triangle.equilateralTriangle(side1, side2, side3) && Triangle.areTriangular(side1, side2, side3)) {
			System.out.println("triangle with side lengths " + side1 + ", " + side2 + " and " + side3 + " is a right equilatera triangle");
		}
		else {
			System.out.println("These lengths cannot form a triangle");
		}
		
		
		
		
		
	}

}
