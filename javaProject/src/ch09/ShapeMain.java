package ch09;

public class ShapeMain {

	public static void main(String[] args) {
		CircleShape c = new CircleShape(5);//��ü���� �� �Ű������� �ִ� ������ ȣ��
		TriangleShape t = new TriangleShape(4, 6);
		RectangleShape r = new RectangleShape(5, 8);
		c.draw();
		System.out.println("���� ������ "+ c.calculateArea()+"�Դϴ�.");
		
		t.draw();
		System.out.println("�ﰢ���� ������ "+ t.calculateArea()+"�Դϴ�.");
		
		r.draw();
		System.out.println("�簢���� ������"+r.calculateArea()+"�Դϴ�.");
	}

}
