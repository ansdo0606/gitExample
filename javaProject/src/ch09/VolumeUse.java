package ch09;

public class VolumeUse {

	public static void main(String[] args) {
		Volume vo1 = new Volume();//��ü����
		System.out.println("���� : "+vo1.getVolume());
		Volume vo2 = new Volume(10,20,30);
		System.out.println("���� : "+vo2.getVolume());
	}

}
