	package ch09;

class Animal{
	public  Animal(String s) {
		System.out.println("����  : "+s);
	}
}
class Mammal extends Animal{
	public  Mammal() {//�⺻������
	 super("������");// �θ�Ŭ���� ������ ȣ��
		System.out.println("������ : ������");
}

	public Mammal(String s) {//�Ű������� �ִ� ������
		super(s);//�θ�Ŭ���� ������ ȣ��
		System.out.println("������ : "+ s);
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape = new Mammal();//��ü���� �� �⺻������ ȣ��
		Mammal lion = new Mammal("����");//��ü���� �� �Ű������� �ִ� ������ ȣ��(�޼ҵ�ȣ��)
	}

}
