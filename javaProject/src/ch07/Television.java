package ch07;

public class Television {
	//�ɹ�����(����,�ʵ�)
	int channel;//ä�� 7  | �ٸ� �޸𸮿� 9 ����
	int volume; //���� 9  | �ٸ� �޸𸮿�  12����
	boolean onoff; //����  ���� true | �ٸ��޸𸮿� false
	void print() {
		System.out.println("ä���� " + channel + "�̰� ������ " + volume + "�Դϴ�.");
	}
	int getChannel() { //default
		return channel;
	}
	void setChannel(int ch) {
		channel = ch; //�캯�� ���� �º�����(���������� �ɹ������� ����)
	}
}
