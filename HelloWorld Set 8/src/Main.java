// class: Main
// written by: Eli Dresnin
// date: Sep 8, 2022
// description: Random methods to remember every thing I forgot over the summer. 
import java.util.*;

public class Main {
	
	
	// method name: Bob
	// description: gets number >30 and <100, even, and divisable by 7
	// parameters: int number - number to test if bob will like
	// return: Booleen - true if bob would like, false if bob won't.
	public static boolean bob(int number) {
		return(number % 2 == 0 && number > 30 && number < 100 && number % 7 == 0);
	
	}
	
	
			// method name: Prime
			// description: Checks to see if a number is prime.
			// parameters: int num - number that is being tested for prime
			// return: booleaan - true if num is prime, false if not.
	public static boolean isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
			
				return false;
			
		}
	
	public static String waterGunGame(int numPlayers) {
		if (numPlayers >= 2 && numPlayers <= 4) {
			return "Small Teddy Bear";
		}
		else if (numPlayers >= 5 && numPlayers <= 7) {
			return "Medium Puppy Dog";
		}
		else if (numPlayers == 8) {
			return "Large Cute Avocado";
					
		}
		else {
			return "There are too many or too few players";
		}
		
		
			
			
	}
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int players = s.nextInt();
		
		System.out.println(waterGunGame(players));
		

	}

}
