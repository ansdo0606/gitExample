package ch09;

public class Manager extends Employee{

	public void input(int num,String name,String address, 
			String email,int salary, String rrn) {
		//�θ��� privateó���� ��������� ���� �ʱ�ȭ �Ҷ��� setter�� Ȱ��
		setNum(num);
		this.name=name;
		this.address=address;
		this.email=email;
		this.salary=salary;
		setRrn(rrn);
		
		
	}
	public void print() {
		System.out.println("----------------------------------------------");
		System.out.println("�����ȣ : "+getNum()+"\n"+"�̸� : "+name+"\n"+"�ּ� : "+address+
				"\n"+"�̸��� �ּ� : "+email+"\n"+"���� : "+salary+"\n"+"�ֹι�ȣ : "+getRrn());
		System.out.println("----------------------------------------------");

	}
}
