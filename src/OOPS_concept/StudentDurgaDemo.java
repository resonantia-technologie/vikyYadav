package OOPS_concept;

public class StudentDurgaDemo {
	String name;
	int rollno;

	public StudentDurgaDemo(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public String toString() {
		return name + " ---" + rollno;
	}

	public static void main(String[] args) {
		StudentDurgaDemo s1 = new StudentDurgaDemo("Ravi", 102);
		StudentDurgaDemo s2 = new StudentDurgaDemo("Ganesh", 106);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

	}

}
