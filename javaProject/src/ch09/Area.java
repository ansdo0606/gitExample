package ch09;

public class Area {
	//�������
	private  int width; //int �⺻ 0���� �ʱ�ȭ,30
	private int length; //0,20
	//������
	public Area() {}
	public Area(int width,int length) {//30,20
		this.width=width;
		this.length=length;
	}
	//getter,setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//�Ϲݸ޼ҵ�
	public int getArea() {
		return width*length;//30*20
	}
	
}
	

