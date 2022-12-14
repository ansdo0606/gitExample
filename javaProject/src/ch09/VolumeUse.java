package ch09;

public class VolumeUse {

	public static void main(String[] args) {
		Volume vo1 = new Volume();//按眉积己
		System.out.println("何乔 : "+vo1.getVolume());
		Volume vo2 = new Volume(10,20,30);
		System.out.println("何乔 : "+vo2.getVolume());
	}

}
