package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv = new Television();//��ü ����
		System.out.println(myTv);
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onoff = true;
		myTv.print(); //�޼ҵ� ȣ��
		
		Television yourTv = new Television(); //�ٸ� �޸� �������� ��ü ����
		System.out.println(yourTv);
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onoff = false;
		yourTv.print();
		
		
	}

}
