package homework_0116;

public class Employee {
	
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public void getInfomation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary());
	}
	public void print() {
		System.out.println("수퍼클래스");
	}
}
