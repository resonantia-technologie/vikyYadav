package collection;

public class Employee {
	private int eId;
	private String eName;
	private int age;
	private double salary;

	public Employee(int id, String name, int age, double salary) {
		this.eId = id;
		this.eName = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int geteId() {
		return eId;
	}
	
	public String geteName() {
		return eName;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	
	
	

}
