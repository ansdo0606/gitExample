package ch03;

public class ShiftEx {
//����Ʈ ������
	public static void main(String[] args) {
		int a = 2;//������ 0010
		int b = a << 2;//������ 1000(������ : 8)
		System.out.println(b);
		b = b >> 2;// 1000 => 0010
		System.out.println(b);
		
		
	}

}
