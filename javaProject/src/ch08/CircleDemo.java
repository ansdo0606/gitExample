package ch08;

class Circle{
	//�������
	double radius;
	String color;
	public Circle(double r ,String c) {//r=10.0 c=����
		radius = r;
		color = c;
	}
	public Circle(double r){//r=5.0
		radius = r;
		color = "�Ķ�";
	}
	public Circle(String c){//c=���
		radius =21.0;
		color = c;
	}
	public Circle() {//r=3.5 c=����		�⺻������
		radius = 3.5;
		color = "����";
	}
	//��¿뵵
	public void print() {
		System.out.println("������ : "+radius);
		System.out.println("���� : "+color);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0,"����");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("���");
		c3.print();
		
		Circle c4 = new Circle();//�⺻������ ȣ��
		c4.print();
		
	}

}
