package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
		Television myTv = new Television();//��ü����
		myTv.channel =11;
		myTv.volume = 9;
		myTv.onoff = true;
		int ch = myTv.getChannel(); //�������� ���� Ÿ������ �޾ƾ� �Ѵ�.
		System.out.println("���� ä���� " + ch + "�Դϴ�.");
		
	}

}
