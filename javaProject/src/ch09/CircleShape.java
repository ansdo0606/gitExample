package ch09;

public class CircleShape extends Shape{
	private int radius;//5
	//getter,setter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	//�Ű������� �ִ� ������
	public CircleShape(int radius) {//radius = 5
		super("Circle");//�θ������(�Ű������� �ִ�) ȣ��
		this.radius = radius;
	}
	
	
	//�θ�Ŭ������ �ɹ��޼ҵ� �������̵�
	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
	@Override
	public void draw() {
		System.out.print("��������" + radius + "�� ��");
		super.draw();//�θ���  draw�� ȣ��
	}
}
