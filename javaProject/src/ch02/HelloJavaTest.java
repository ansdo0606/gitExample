package ch02;

public class HelloJavaTest {

	public static void main(String[] args) {
		char aValue ='\uD64D';
		char bValue ='\uAE38';
		char cValue ='\uB3D9';
		
		System.out.println("홍 길 동 ");
		
		System.out.println("char형(\'\\uD64D\') : " + aValue);
		System.out.println("char형(\'\\uAE38\') : " + bValue);
		System.out.println("char형(\'\\uB3D9\') : " + cValue);
	}
}
