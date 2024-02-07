import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr1 = {{1,2,3},
						{4,5,6},
						{7,8,9}
		};
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		int menu = 0;
		while (menu != 4) {
			System.out.println("Enter:");
			System.out.println("1 - rowSwap");
			System.out.println("2 - columnSwap");
			System.out.println("3 - fillByRow");
			System.out.println("4 - printArray");
			System.out.println("5 - exit");
			menu = s.nextInt();

			if (menu == 1) {
				System.out.println("Enter rows to swap");
				printArray(rowSwap(arr1, s.nextInt(), s.nextInt()));
			}

			else if (menu == 2) {
				System.out.println("Enter columns to swap");
				printArray(columnSwap(arr1, s.nextInt(), s.nextInt()));
				

			}
			else if (menu == 3) {
				System.out.println("enter the length of the row and column");
				printArray(fillByRow(arr2, s.nextInt(), s.nextInt()));
				
			}
			else if (menu == 4){
				printArray(arr1);
			}
			
			else {
				break;
			}



		}

	}
		
	// method name: rowSwap
	// description: Swaps 2 rows of a 2d array
	// parameters: int[][] nums, int i1, int i2
	// return: int[][] nums
	public static int[][] rowSwap(int[][] nums, int i1, int i2) {
		for (int i = 0; i < nums.length; i++) {
			int t = nums[i1][i];
			nums[i1][i] = nums[i2][i];
			nums[i2][i] = t;
		}
		return nums;
		
	}
	
	// method name: columnSwap
	// description: Swaps 2 columns of a 2d array
	// parameters: int[][] nums, int i1, int i2
	// return: int[][] nums
	public static int[][] columnSwap(int[][] nums, int i1, int i2) {
		
		for (int i = 0; i < nums.length; i++) {
			int t = nums[i][i1];
			nums[i][i1] = nums[i][i2];
			nums[i][i2] = t;
		}
		return nums;
	}
	// method name: fillByRow
	// description: passed a 1d array and dimensions, turns in to a 2d array.
	// parameters: int[] nums, int cLength, int rLength
	// return: int[][] out
	public static int[][] fillByRow(int[] nums, int cLength, int rLength){
		int[][] out = new int[cLength][rLength];
		int index = 0;
		for (int i = 0; i < cLength; i++) {
			for (int j = 0; j < rLength; j++) {
				out[i][j] = nums[index];
				index++;
			}
			
		}
		return out;
				
	}
	
	// method name: printArray
	// description: prints the contents of a 2d array
	// parameters: int[][] nums
	// return: none 
	public static void printArray(int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
	

}
