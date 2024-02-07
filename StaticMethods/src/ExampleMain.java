
public class ExampleMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example(19, "Joe");
		 //Object methods
		e.setName("Andrew");
		System.out.println(e.getName());
		System.out.println(e);
		
		//Static Methods
		System.out.println(Example.PI);
		System.out.println(Example.Squared(Example.PI));
	
	}

}


