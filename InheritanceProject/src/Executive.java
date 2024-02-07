// class: Executive
// written by: Eli Dresnin
// date: Mar 13, 2023
// description: executive class for inheritance project, extends manager, which extends employee.
public class Executive extends Manager {
	private String title;

	public Executive(String name, double salary, String department, String title) {
		super(name, salary, department);
		this.title = title;
	}
	public Executive() {
		this(" ", 1, " ", " ");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Executive [title=" + title + ", getDepartment()=" + getDepartment() + ", getName()=" + getName()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	

}
