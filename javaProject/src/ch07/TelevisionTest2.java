package ch07;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Television myTv = new Television();//��ü ���� => �޸𸮿� �ε�
		System.out.println(myTv);//�޸� �ּҰ� ���(�ؽ��ڵ�)
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onoff = true;
		System.out.println("���� �ڷ������� ä���� "+ myTv.channel+"�̰� ������ "+ 
		myTv.volume+"�Դϴ�.");
		
		Television yourTv =new Television();//��ü����
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onoff = false;
		System.out.println("���� �ڷ������� ä���� "+ yourTv.channel+"�̰� ������ "+ 
				yourTv.volume+"�Դϴ�.");
		
	}

}
