package ch09;

public class Employee_A {
	private int num;//�����ȣ
	public String name;//�̸�
	String address;//�ּ�
	String email;//�̸��� �ּ�
	protected int salary;//����
	private String rrn;//�ֹι�ȣ
	
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
	@Override//�����ڸ� ���� 
	public String toString() {
		return "Employee_A [num=" + num + ", name=" + name + ", address=" + address + ", email=" + email + ", salary="
				+ salary + ", rrn=" + rrn + "]";
	}
	
}
