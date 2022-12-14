package ch09;

public class TriangleShape extends Shape {
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
	//�Ű������� �ִ� ������
	public TriangleShape(int width,int height) {//4,6
		super("Triangle");
		this.width=width;
		this.height=height;
		
	}
	//�θ�Ŭ������ ����޼ҵ� �������̵�
	@Override
	public double calculateArea() {
		return width*(height*0.5);
	}
	@Override
	public void draw() {
		System.out.print("���̰� " + height + ", �غ��� " + width + "�� �ﰢ�� ");
		super.draw();//�θ��� draw()ȣ��
	}
}
