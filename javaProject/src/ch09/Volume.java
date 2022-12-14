package ch09;

public class Volume extends Area{
	//멤버변수
	private int heigth; //0,10
	public Volume() {}
	public Volume(int heigth,int length,int width) {//10,20,30
		super(width,length);//부모클래스의 생성자 호출  30,20
		this.heigth = heigth;
	}
	public int getVolume () {
		return getArea()*heigth;//600*0
	}
}
