
public class maine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumN(10));
		System.out.println(factorialN(10));

	}
	public static int sumN(int n) {
		
		if(n > 1) 
			return n + sumN(n-1);
		return 1;
	
	
	}
public static int factorialN(int n) {
		
		if(n > 1) 
			return n * factorialN(n-1);
		return 1;
	
	
	}


}
