package ch10;

//final class A2{//final�� ������ class�� ����� �ȵȴ�
class A2{
	void print() {
	//final void print() { //final�� ������ �޼ҵ�� �������̵��� �ȵȴ� �׷��� ������
		System.out.println("a");
	}
}
class B2 extends A2{
	@Override
	void print() {
		super.print();//�θ��� ����Ʈ �޼ҵ带 ȣ��
		System.out.println("b");
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		B2 b=new B2();
		b.print();
	}
}
