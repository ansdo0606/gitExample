package ch06;


public class CallEx {

	public static void main(String[] args) {
		System.out.println("����");
		int a =10;
		test(a); //a�� call by value�������� ȣ��, �޼��� ȣ��
		
		test2(a);
		System.out.println("��");;
	} //���α׷� ��

	private static void test2(int a) {  //a=10
		System.out.println(a);
	}

	private static void test(int b) {  //b=10
		System.out.println("test method ȣ��");
		System.out.println(b);
	}

}
