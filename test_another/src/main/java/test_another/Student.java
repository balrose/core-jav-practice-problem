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

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	

}
