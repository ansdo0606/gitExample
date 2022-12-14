package ch11;

public interface Controllable {
	//�������̽����� ��������� default �޼ҵ���� ������ jdk8���� ����
	default void repair() {
		System.out.println("��� �����Ѵ�.");
	}
	static void reset() {//static �޼ҵ���� ������ jdk8���� ����
		System.out.println("��� �ʱ�ȭ �Ѵ�.");
	}
	//���� : private �޼ҵ� ������ jdk9���� ��밡��
	//�ǹ������� ���� �������̽����� ���� ���� �����޼ҵ带 ������.
	void turnOn();
	void turnOff();
}
