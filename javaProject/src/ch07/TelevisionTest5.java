package ch07;

public class TelevisionTest5 {

	public static void main(String[] args) {
		Television myTv = new Television();//��ü����
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
	}

}
