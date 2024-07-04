package DurgaSir;

public class Student {
	String name;
	int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return name + " ---" + rollno;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Ravi", 102);
		Student s2 = new Student("Ganesh", 106);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

	}

}
