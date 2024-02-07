// class: Array
// written by: Eli Dresnin
// date: Nov 9, 2022
// description: Array project
import java.util.*;
public class Array {
	// method name: EvenOdd
	// description: Enter 10 ints, sorts as even, odd, and negative.
	// parameters: none
	// return: none
	public static void EvenOdd() {
		Scanner s = new Scanner(System.in);
		
		int[] even = new int[10];
		int[] odd = new int[10];
		int[] negative = new int[10];
		int evenIndex = 0;
		int oddIndex = 0;
		int negativeIndex = 0;
		
		System.out.println("enter 10 integers");
		for(int i = 0; i < 10; i++) {
			int x = s.nextInt();
			if(x % 2 == 0) {
				even[evenIndex] = x;
				evenIndex++;
			}
			else if (x % 2 != 0) {
				odd[oddIndex] = x;
				oddIndex++;
			}
			else if (x < 0) {
				negative[negativeIndex] = x;
				negativeIndex++;
			}
			
			
		}
		System.out.println("even");
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + ", ");
			
		}
		System.out.println("odd");
		for (int i = 0; i < odd.length; i++) {
			System.out.print(odd[i] + ", ");
		}
		System.out.println("negative");
		for (int i = 0; i < negative.length; i++) {
			System.out.print(negative[i] + ", ");
		}
				
	
		
	}
	// method name: AboveAverage
	// description: prints numbers that are above average
	// parameters: none
	// return: none
	public static void AboveAverage() {
		Scanner s = new Scanner(System.in);
		double[] nums = new double[10];
		double[] above = new double[10];
		int numsCount = 0;
		int aboveCount = 0;
		double total = 0;
		double average = 0;
		
		System.out.println("enter 10 numbers");
		for(int i = 0; i < 10; i++) {
			int x = s.nextInt();
			nums[numsCount] = x;
			numsCount++;
			
		}
		
		for(int i=0; i<nums.length; i++){
        	total = total + nums[i];
        }
		
		average = total / nums.length;
		 
		for(int i = 0; i < 10; i++) {
			if (nums[i] > average) {
			above[aboveCount] = nums[i];
			aboveCount++;
			}
			
		}
		System.out.println("entered numbers");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
			
		}
		System.out.println("average = " + average);
		System.out.println("above average");
		for (int i = 0; i < above.length; i++) {
			System.out.print(above[i] + ", ");
			
		}	
	}
	// method name: Score
	// description: Enter 10 numbers, remove first and last then calculates average. 
	// parameters: none
	// return: none
	public static void Score() {
		Scanner s = new Scanner(System.in);
		double[] scores = new double[8];
		double[] averages = new double[6];
		int scoresCount = 0;
		int averageCount = 0;
		double total = 0;
		
		for(int i = 0; i < 8; i++) {
			int x = s.nextInt();
			scores[scoresCount] = x;
			scoresCount++;
			
		}
		
		
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		for(int i = 1; i < 7; i++) {
			averages[averageCount] = scores[i];
			averageCount++;
			
		}
		System.out.println(Arrays.toString(averages));
		for(int i=0; i<averages.length; i++){
        	total = total + averages[i];
        }
		
		System.out.println("average = " + (total / averages.length));
		
		
	}
	// method name: Nim
	// description: nim game in java
	// parameters: none
	// return: none
	public static void Nim() {
		Scanner s = new Scanner(System.in);
		boolean[] p1 = new boolean[3];
		boolean[] p2 = new boolean[4];
		boolean[] p3 = new boolean[5];
		int c1 = 2;
		int c2 = 3;
		int c3 = 4;
		System.out.print("pile 1: ");
		for(int i = 0; i<p1.length; i++) {
			p1[i] = true;
			if(p1[i] == true) {
				System.out.print("x ");
			}
		}
		System.out.println("");
		System.out.print("pile 2: ");
		for(int i = 0; i<p2.length; i++) {
			p2[i] = true;
			if(p2[i] == true) {
				System.out.print("x ");
			}
		}
		System.out.println("");
		System.out.print("pile 3: ");
		for(int i = 0; i<p3.length; i++) {
			p3[i] = true;
			if(p3[i] == true) {
				System.out.print("x ");
			}
		}
		System.out.println("");
		int win = 0;
		while(p1[0] != false || p2[0] != false || p3[0] != false) {
			System.out.println("which pile would you like to take from?");
			int piles = s.nextInt();
			System.out.println("how many would you like to take?");
			int take;
			if(piles == 1) {
				while(piles == 1) {
					take = s.nextInt();
					if(take > c1+1 || take<0) {
						System.out.println("enter a different number ");
					}
					else {
						for(int i =c1; i>c1 - take; i--) {
							p1[i] = false;
						}
						c1-=take;
						break;
					}
				}
				win++;
				System.out.print("pile 1: ");
				for(int i = 0; i<p1.length; i++) {
					if(p1[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 2: ");
				for(int i = 0; i<p2.length; i++) {
					if(p2[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 3: ");
				for(int i = 0; i<p3.length; i++) {
					if(p3[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
			}
			if(piles == 2) {
				while(piles == 2) {
					take = s.nextInt();
					if(take > c2+1 || take<0) {
						System.out.println("enter a different number ");
					}
					else {
						for(int i = c2; i>c2 - take; i--) {
							p2[i] = false;
						}
						c2-=take;
						break;
					}
				}
				win++;
				System.out.print("pile 1: ");
				for(int i = 0; i<p1.length; i++) {
					if(p1[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 2: ");
				for(int i = 0; i<p2.length; i++) {
					if(p2[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 3: ");
				for(int i = 0; i<p3.length; i++) {
					if(p3[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
			}
			if(piles == 3) {
				while(piles == 3) {
					take = s.nextInt();
					if(take > c3+1 || take<0) {
						System.out.println("Enter a different number please");
					}
					else {
						for(int i = c3; i>c3-take; i--) {
							p3[i] = false;
						}
						c3-=take;
						break;
					}
				}
				win++;
				System.out.print("pile 1: ");
				for(int i = 0; i<p1.length; i++) {
					if(p1[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 2: ");
				for(int i = 0; i<p2.length; i++) {
					if(p2[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
				System.out.print("pile 3: ");
				for(int i = 0; i<p3.length; i++) {
					if(p3[i] == true) {
						System.out.print("x ");
					}
				}
				System.out.println("");
			}
		}
		if(win %2 == 0) {
			System.out.println("player 2 wins");
		}
		else {
			System.out.println("player 1 wins");
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int menu= 0;

		while (menu != 5) {
			System.out.println("Enter:");
			System.out.println("1 - EvenOdd");
			System.out.println("2 - AboveAverage");
			System.out.println("3 - Score");
			System.out.println("4 - Nim");
			System.out.println("5 - Exit");
			
			menu = s.nextInt();

			if (menu == 1) {
				EvenOdd();

			}

			else if (menu == 2) {
				AboveAverage();
				
			}
			else if (menu == 3) {
				Score();
				
			}
			else if (menu == 4) {
				Nim();
				
			}
			
			else {
				System.out.println("goodbye");
			}

		}

	}

}
