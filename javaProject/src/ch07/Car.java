package ch07;

public class Car {
	//�ɹ�����
	String color; //����
	int speed;//�ӵ� �ɹ������� �⺻������ int�� 0���� �ʱ�ȭ 0 => 10
	int gear;//���
	
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
