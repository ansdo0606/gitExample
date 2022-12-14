package ch09;

public class Employee_A {
	private int num;//사원번호
	public String name;//이름
	String address;//주소
	String email;//이메일 주소
	protected int salary;//연봉
	private String rrn;//주민번호
	
	public int getNum() {
		return num;
	}
	public String getRrn() {
		return rrn;
	}
	
	
	
	public Employee_A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_A(int num, String name, String address, String email, int salary, String rrn) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
		this.email = email;
		this.salary = salary;
		this.rrn = rrn;
	}
	@Override//개발자를 위한 
	public String toString() {
		return "Employee_A [num=" + num + ", name=" + name + ", address=" + address + ", email=" + email + ", salary="
				+ salary + ", rrn=" + rrn + "]";
	}
	
}
