package ch12;

public class OuterClass {
	private static int x = 10;
	class Inner{//����Ŭ���� (��øŬ����, �ν��Ͻ� Ŭ����)
		int getX() {
			return x;//�ܺ�Ŭ������ private������ ������� ��밡��
		}
	}
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e=new OuterClass();
		OuterClass.Inner in=e.new Inner();
		System.out.println(in.getX());
	}
}
