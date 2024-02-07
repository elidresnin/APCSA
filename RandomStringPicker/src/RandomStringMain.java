import java.util.Scanner;



public class RandomStringMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int count = 1;
		while(count != 0) {
			System.out.println("do you want to create a");
			System.out.println("[1] string picker or ");
			System.out.println("[2] letter picker");
			System.out.println("[0] to quit");
			count = s.nextInt(); 
			s.nextLine(); 
			
			if (count == 1) {
				System.out.println("enter 4 words: ");
				String[] strings = new String[4]; 
				for(int i = 0; i < 4; i++) { 
					strings[i] = s.nextLine(); 
				}
				RandomStringPicker sPicker = new RandomStringPicker(strings); 
				for (int k = 0; k < 4; k++) { 
					System.out.print(sPicker.getNext() + " "); 
				}
				System.out.println();

			}

			else if (count == 2) {
				System.out.println("enter a string with 4 characters: ");
				String letters = s.nextLine(); 
				RandomLetterPicker letterPicker = new RandomLetterPicker(letters);
				for (int k = 0; k < 4; k++) { 
					System.out.print(letterPicker.getNext()); 
				}

				System.out.println();
			}
		}
	}
}





