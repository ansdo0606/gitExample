package ch09;

public class Manager_A extends Employee_A{
	private double bonus;
	
	public Manager_A(int num, String name, String address, 
			String email, int salary, String rrn,double bonus) {
		super(num,name,address,email,salary,rrn);
		this.bonus=bonus;
	}
	void test() {
		System.out.println("�����ȣ : "+getNum());
		System.out.println("�̸� : "+name);
		System.out.println("�ּ� : "+address);
		System.out.println("�̸��� : "+email);
		System.out.println("���� : "+salary);
		System.out.println("�ֹι�ȣ : "+getRrn());
		System.out.println("���ʽ� : "+(bonus*salary));
	}
}
