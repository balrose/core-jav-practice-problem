package test_another;

public class Student {
	public static void main(String[] args) {
	
		Student S1 = new Student("John", 1001);

		Student S2 = new Student("John", 1001);

		boolean h = S1.equals(S2);
		int x = S1.hashCode();
		int y = S2.hashCode();
		System.out.println(y+" ,"+x+" ,"+h);
	}
	private String name;
	private Integer id;

	public Student(String name, Integer id) {
		this.id = id;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
