package ch10;

//static =>�޸𸮿� �ٷ� �ε�
//nonstatic => ��ü���� �Ŀ� �ε�
public class A {
	//�������
	String name = "Kim";//nonstatic member
	static int n = 20; //static member
	//����޼ҵ�
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {// static member 
		//static������ �ڷ������ �����ο�
		//��������
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A  aa = new A(); // nonstatic member�� ��ü���� �Ŀ� ��� �����ϴ�
		System.out.println(aa.name);
	}

}
