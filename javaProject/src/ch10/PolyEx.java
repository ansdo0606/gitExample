package ch10;

public class PolyEx {
	public static void main(String[] args) {
		int a =10;
		double b =20.1;
		char c = 'A';
		String d="hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("=====================");
		//�ֻ��� Ŭ������ object�� ��� Ÿ���� �� �ٷ�� �ִ�.
		//���� ��� �ڵ带 object�θ� ���� ���α׷��� ���ſ����� �ӵ�����
		//��, �Ѱ��� �ڷ������� �پ��� ������ �ڷ����� ó���Ҽ� �ִ� �ɷ��� �������̶� �Ѵ�.
		
		Object o="Java"; 
		//o=10;
		//o=22.5;
		System.out.println(o);
	}
}
