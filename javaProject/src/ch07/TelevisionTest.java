package ch07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television(); //��ü����(�ν��Ͻ�ȭ)
		//System.out.println(tv); �ּҰ�
		tv.channel = 7; //tv. => �ν��Ͻ�ȭ�� Television �޸��� �ּҰ����� ����
		tv.volume = 9;
		tv.onoff = true;
		System.out.println("�ڷ������� ä���� "+tv.channel+"�̰� ������ "+ tv.volume+"�Դϴ�.");
		
		
		
		
	}

}
