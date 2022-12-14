package ch11;

public class Notebook implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("³ëÆ®ºÏÀ» ÄÒ´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("³ëÆ®ºÏÀ»  ²ö´Ù");
	}

}
