package ch10;

public class Test {
	static int a=10; //static member
	int b=20; //nonstatic member
	void print() { //nonstatic member �޼ҵ�
		System.out.println(a);//static =>�̹� �޸𸮿� �ö�� �ֱ� ������ ������ ���� (�켱����)
		System.out.println(b);//nonstatic
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Test t = new Test();
		System.out.println(t.b);
		t.print();
		//t=null;//��ü�� �ּҰ��� �ʱ�ȭ(�ּҰ��� �Ҿ����)

		
	}
}
