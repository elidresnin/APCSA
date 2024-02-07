
import java.util.ArrayList;

public class RandomStringPicker {
	private ArrayList<String> strings; 
	
	public RandomStringPicker(String[] strings) { 
		this.strings = new ArrayList<>(); 
		for(String s : strings) { 
			this.strings.add(s); 

		}
	}

	public String getNext() { 
		while(strings.size() != 0) { 
			int num = (int)(Math.random()*strings.size());
			String string1 = strings.get(num); 
			strings.remove(num);  
			return string1; 
		}
		return "n/a"; 
	}

}

