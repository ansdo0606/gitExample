package ch07;


public class Radio {
	double channel;
	int volume;
	boolean onoff;
	
	void print() {
		while (onoff == true) {
			System.out.println("������ ���� �ֽ��ϴ�.");
			break;
		}
		while (onoff == false) {
			System.out.println("������ ���� �ֽ��ϴ�.");
			break;
		}
		System.out.println("���� ä���� " + channel + "�Դϴ� ");
		System.out.println("������ " + volume + "�Դϴ� ");
	}
	
	
}
