package ch11;

public class Notebook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("��Ʈ���� �Ҵ�");
	}

	@Override
	public void turnOff() {
		System.out.println("��Ʈ����  ����");
	}

}
