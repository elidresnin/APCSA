// class: NewWaveMain
// written by: Eli Dresnin
// date: Nov 18, 2022
// description: Main Class for New Wave Arrays Project 
import java.util.*;
public class NewWaveMain {
	
	public static double getOrderTotal(int bp, int nb) {
		if (bp + nb >= 12) {
			return (bp + nb) * 16.00;
		}
		else if (bp + nb >= 3) {
			return (bp + nb) * 16.95;
		}
		else {
			return 39.95;
		}
			
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employee[ ] employees = new Employee[10];
		String[] names = {"Peter Gibbons", "Joanna", "Michael Bolton", "Samir Nagheenanajar", "Lawerence", "Milton Waddoams", "Bill Lumbergh", "Tom Smykowski", "Bob Slydell", "Bob Porter"};
		int[] salarys = {54000, 26000, 63000, 32000, 23000, 0, 1200000, 62000, 75000, 72000};
		
		for(int i = 0; i < employees.length; i++) {
			employees[i] = new Employee(names[i], salarys[i]);
		}
		
		Arrays.sort(employees);
		System.out.println("All employees: " + Arrays.toString(employees));
		
		Employee[] fired  = {employees[7], employees[8], employees[9]};
		
		System.out.println("fired employees: " + Arrays.toString(fired));
		
		
		
		System.out.println("enter books");
		System.out.println(getOrderTotal(s.nextInt(),s.nextInt()));

	}

}
