package ch09;

public class Manager_A extends Employee_A{
	private double bonus;
	
	public Manager_A(int num, String name, String address, 
			String email, int salary, String rrn,double bonus) {
		super(num,name,address,email,salary,rrn);
		this.bonus=bonus;
	}
	void test() {
		System.out.println("사원번호 : "+getNum());
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
		System.out.println("연봉 : "+salary);
		System.out.println("주민번호 : "+getRrn());
		System.out.println("보너스 : "+(bonus*salary));
	}
}
