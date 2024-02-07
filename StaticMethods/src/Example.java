public class Example {
	private int age;
	private String name;
	public static final double PI = 3.1415926;

	public Example() {
		this(1, "bob");
	}
	public Example(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Example [age=" + age + ", name=" + name + "]";
	}
	public static double Squared(double num) {
		return num * num;
	}
}
