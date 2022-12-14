package ch07;


public class Radio {
	double channel;
	int volume;
	boolean onoff;
	
	void print() {
		while (onoff == true) {
			System.out.println("라디오가 켜져 있습니다.");
			break;
		}
		while (onoff == false) {
			System.out.println("라디오가 꺼져 있습니다.");
			break;
		}
		System.out.println("현재 채널은 " + channel + "입니다 ");
		System.out.println("볼륨은 " + volume + "입니다 ");
	}
	
	
}
