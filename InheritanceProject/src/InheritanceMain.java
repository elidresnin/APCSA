// class: InheritanceMain
// written by: Eli Dresnin
// date: Mar 13, 2023
// description: Main class of inheritance project
public class InheritanceMain {

	public static void main(String[] args) {
		Employee e = new Employee("Harry" , 35000);
		Manager m = new  Manager("bole", 100000, "Math");
		Executive eli = new Executive("eli", 1000000000, "everything", "CEO");
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		System.out.println(eli.toString());
		
		
		
		e.setName("ethan");
		m.setDepartment("chemistry");
		eli.setSalary(2000000000);
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		System.out.println(eli.toString());
		
		

		


	}

}
