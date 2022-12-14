package ch09;

public class Manager extends Employee{

	public void input(int num,String name,String address, 
			String email,int salary, String rrn) {
		//부모의 private처리된 멤버변수에 값을 초기화 할때는 setter를 활용
		setNum(num);
		this.name=name;
		this.address=address;
		this.email=email;
		this.salary=salary;
		setRrn(rrn);
		
		
	}
	public void print() {
		System.out.println("----------------------------------------------");
		System.out.println("사원번호 : "+getNum()+"\n"+"이름 : "+name+"\n"+"주소 : "+address+
				"\n"+"이메일 주소 : "+email+"\n"+"연봉 : "+salary+"\n"+"주민번호 : "+getRrn());
		System.out.println("----------------------------------------------");

	}
}
