package ch09;

public class Volume extends Area{
	//�������
	private int heigth; //0,10
	public Volume() {}
	public Volume(int heigth,int length,int width) {//10,20,30
		super(width,length);//�θ�Ŭ������ ������ ȣ��  30,20
		this.heigth = heigth;
	}
	public int getVolume () {
		return getArea()*heigth;//600*0
	}
}
