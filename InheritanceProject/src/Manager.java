// class: Manager
// written by: Eli Dresnin
// date: Mar 13, 2023
// description: Manager class for inheritance project, extends employee.
public class Manager extends Employee {
	private String department;


	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}
	public Manager() {
		this(" ", 1, " ");
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	
	

}
