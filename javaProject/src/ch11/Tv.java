package ch11;

public class Tv implements Controllable, RemoteControllable {

	@Override
	public void remoteOn() {
		System.out.println("���������� TV�� �Ҵ�");
	}

	@Override
	public void remoteOff() {
		System.out.println("���������� TV�� ����");
	}

	@Override
	public void turnOn() {
		System.out.println( "TV�� �Ҵ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ����");
	}

}
