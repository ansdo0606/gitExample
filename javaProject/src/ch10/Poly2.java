package ch10;

class Pa{
	String name="ȫ�浿";
	public void print() {
		System.out.println("�̸� : "+name);
	}
}

class Ch extends Pa{
	int age = 30;
	@Override
	public void print() {
		super.print();//�θ��� print ȣǮ
		System.out.println("���� : "+age);
	}
}
public class Poly2 {
	public static void main(String[] args) {
		String tel="010-1234-5678";
		Pa c = new Ch();//������
		c.print();
		System.out.println("��ȭ��ȣ : "+tel);
	}
}
