package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();//static ����϶��� Ŭ���� �̸�.�޼ҵ��̸�
		
		System.out.println();
		Computer com= new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
		System.out.println();
		Notebook n = new Notebook();
		n.turnOn();
		n.turnOff();
		n.repair();
		Controllable.reset();
		
	}

}
