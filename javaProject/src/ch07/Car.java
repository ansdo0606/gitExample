package ch07;

public class Car {
	//맴버변수
	String color; //색상
	int speed;//속도 맴버변수는 기본적으로 int는 0으로 초기화 0 => 10
	int gear;//기어
	
	@Override
	public String toString() {//roqkfwkdyd zhem
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed = speed + 10;
	}
	void speedDown() {
		speed = speed - 10;
	}
}
