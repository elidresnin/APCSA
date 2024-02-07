
public class Rohan {
	
	public static void main(String[] args) {
		int[] Numbers = new int[10];
		for(int i = 0; i < Numbers.length; i++) {
			Numbers[i] = (int)(Math.random()*100);
		
		}
		int sum = 0;
		for(int i = 0; i < Numbers.length; i++) {
			sum += Numbers[i];
		
		}
		for(int i = 0; i < Numbers.length; i++) {
			System.out.println(Numbers[i]);
		
		}
		System.out.println("sum" +sum);
		
	}

}
