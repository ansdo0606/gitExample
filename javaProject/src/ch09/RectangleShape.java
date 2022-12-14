package ch09;

public class RectangleShape extends Shape{
	private int width;
	private int height;
	
	//getter,setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	//�Ű����� ������
	public RectangleShape(int width, int height) {
		super("Rectangle");
		this.width = width;
		this.height = height;
	}
	//�θ�Ŭ������ ����޼ҵ� �������̵�
	@Override
	public double calculateArea() {
		return width*(double)height;
	}
	@Override
	public void draw() {
		System.out.print("���ΰ� " + width + ", ���ΰ� " + height + "�� �簢��");
		super.draw();
	}
}
