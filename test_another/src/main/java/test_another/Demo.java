package test_another;

public class Demo {
	private int id;
	private String name;

	public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo() { // default constructor is created from source but will not have any field.

	}

	public static void main(String[] args) {
		/*
		 * Demo demo = new Demo(); demo.setId(100); //demo.setName("Jhon Doe");
		 * System.out.println(demo.getName()); //non parameraterazed constructor will
		 * give Jhon Doe name.
		 */

		Demo demo = new Demo(110, "Jhon Doe : "); // parameraterazed constructor will give Jhon Doe name. And Demo is
													// data type BUT Customer DATA Type. demo is name of variable and
													// new is value assignment
		System.out.printf(demo.getName());

		System.out.println(demo.getId());

	}

}
