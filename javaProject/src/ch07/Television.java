package ch07;

public class Television {
	//맴버변수(전역,필드)
	int channel;//채널 7  | 다른 메모리에 9 저장
	int volume; //볼륨 9  | 다른 메모리에  12저장
	boolean onoff; //전원  상태 true | 다른메모리에 false
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	int getChannel() { //default
		return channel;
	}
	void setChannel(int ch) {
		channel = ch; //우변의 값을 좌변으로(지역변수를 맴버변수에 저장)
	}
}
