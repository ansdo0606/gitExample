package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a;//�ڵ�����ȯ
		System.out.println("int a => double :" + d);
		
		/*int e = b;// �Ǽ����� �� ũ�� ������ ������ ��*/
		int e = (int)b;//���� ����ȯ (���������ȯ)
		System.out.println("float b => int : " + e);
		
		byte f = (byte) c;
		System.out.println("Int c => byte : " + f);
		
		
		
		
	}

}
