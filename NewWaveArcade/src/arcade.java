import java.util.Arrays;
import java.util.Scanner;

// class: arcade
// written by: Eli Dresnin
// date: Sep 14, 2022
// description: New Wave Arcade review project "New Wave Computers has set up an arcade to supplement their income. Help New Wave Computers out by writing functions that complete the tasks that are listed below." 
public class arcade {

	
	// method name: highScore
	// description: Dolphin Olympics 2 is an exciting aquatic game that invites you to score as many points as possible in two minutes. The goal is to swim and flip your dolphin. All you have to do is drive the mammal to stellar jumps by building speed and pulling bigger and better tricks. You are to write the function highScore, which will be used to list high scores at the end of the game. This function should be passed three integer values and return the highest of these three scores.
	// parameters: int one, int two, int three - scores from game
	// return: int - highest of the 3 scores
	public static int highScore(int one, int two, int three) {
		int []array = {one, two, three};
		Arrays.sort(array);
		return array[2];
		
	}
	
	// method name: isClosed
	// description: New Wave Computers occasionally has to close when there is bad weather. Write the function isClosed. This function should be passed the boolean isRaining and the double temperature. The function should return true if isRaining is and the temperature is below 65 or above 95, otherwise it should return false.
	// parameters: boolean isRaining, double temperature
	// return: 
	public static boolean isClosed(boolean isRaining, double temperature) {
		return (temperature > 95 && temperature < 65 && isRaining == true);
	}
	
	
	// method name: multiply
	// description: New Wave Computers has a difficult time attracting customers during the work week. In order to attract patrons between Monday and Thursday they have decided to multiply their prize tickets on these days. Write the function multiply. This function should be passed integer tickets and String day. Return the new amount of tickets using the following multipliers:
	// parameters: int tickets, String day - Number of tickets a player has, day of the week.
	// return: number of tickets after multiplier was applied. 
	public static double multiply(double tickets, String day) {
		if (day.equalsIgnoreCase("Monday")) {
			return tickets * 2;
		}
		else if (day.equalsIgnoreCase("tuesday")) {
			return tickets * 3;
		}
		else if (day.equalsIgnoreCase("wednesday")) {
			return  tickets * 2.1;
		}
		else if (day.equalsIgnoreCase("thursday")) {
			return  tickets * 2.5;
		}
		else 
			return tickets;
	}
	
	// method name: racing
	// description: In the game New Wave Racing a car randomly moves forward between one and five at a time until it has reached the finish line, which is 50 spaces away. Write the function racing, which should simulate the number of turns that it would take to reach the finish line. 
	// parameters: none
	// return: number of turns
	public static int racing() {
		int turns = 0;
		for(int i = 0; i <= 50; i += (int)(Math.random() * 5) + 1) {
			turns ++;
		}
		return turns;
		
	}
	
	// method name: knockdown
	// description: n the game of knock down a contestant is given three chances to throw a baseball at five pins. In order to win the game, competitors need to knock down all five pins with their three attempts.
	// parameters: none 
	// return: boolean - true if all pins are knocked down. 
	public static boolean knockdown() {
		int pinTotal = 0;
		for(int i = 0; i < 3; i++) {
			int a = (int)(Math.random()*10);
			if(a <= 4)
				pinTotal += 0;
			if(a > 4 && a < 7)
				pinTotal += 1;
			if(a == 7 || a == 8)
				pinTotal += 2;
			if(a == 9)
				pinTotal += 3;
			if(a == 10)
				pinTotal += 4;
			
		}
		return(pinTotal > 5);
			
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to New Wave Arcade!");
		System.out.println("1. HighScore");
		System.out.println("2. isClosed");
		System.out.println("3. Multiply");
		System.out.println("4. Racing");
		System.out.println("5. Knockdown");
		System.out.println("Enter the number of the program you would like to run.");
		
		int select = s.nextInt();
		
		if (select == 1) {
			System.out.println("Enter the first score");
			int one = s.nextInt();
			System.out.println("Enter the second score");
			int two = s.nextInt();
			System.out.println("Enter the thrid score");
			int three = s.nextInt();
			
			System.out.println(highScore(one, two, three));
			
		}
		else if (select == 2) {
			System.out.println("Is it raining? (true or false)");
			boolean rain = s.nextBoolean();
			System.out.println("What is the temperature");
			int temp = s.nextInt();
			
			System.out.println(isClosed(rain, temp));
		}
		else if (select == 3 ) {
			System.out.println("Enter the the number of tickets");
			double tickets = s.nextDouble();
			System.out.println("Enter the day of the week");
			String day = s.next();
			
			System.out.println(multiply(tickets, day));
;		}
		else if (select == 4) {
			System.out.println(racing() + " turns");
		}
		else if (select == 5) {
			System.out.println(knockdown());
		}
		

	}

}
