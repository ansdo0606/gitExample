package ch12;

public class StaticOuter {
	static int x = 10;
	static class Inner {//static inner class
		int getX() {
			return x;
		}
	}
	public static void main(String[] args) {
		//new �ܺ�Ŭ�����̸�.����Ŭ���� ������
		StaticOuter.Inner in =new StaticOuter.Inner();//���� static Ŭ���� ����
		System.out.println(in.getX());
	}
	
}
