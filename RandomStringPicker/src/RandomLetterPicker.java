

public class RandomLetterPicker extends RandomStringPicker {
	private String string; 

	public RandomLetterPicker(String string) { 
		super(getSingleLetters(string)) ; 

	}

	public static String[] getSingleLetters(String string) { 
		String[] arr = new String[string.length()]; 
		for(int i = 0; i < string.length(); i++) { 
			arr[i] = string.charAt(i) + ""; 

		}
		return arr; 

	}
}

