package ch09;

public class InheritanceEx {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("������");//��ü������ ���ÿ� �Ű������� �ִ� ������ ȣ��
		System.out.println("�� : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("�� : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		
		Circle c3 = new Circle(4);
		Circle c4 = new Circle();
		
	}

}
