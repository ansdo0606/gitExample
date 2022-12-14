package ch11;

public class ControllableDemo {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();//static 멤버일때는 클래스 이름.메소드이름
		
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
