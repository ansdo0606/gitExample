package ch06;


public class OverloadEx1 {

	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi","Java");
		
	}
	static void print(double b) {
		System.out.println(b);
	}
	static void print(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	static void print(String b) {
		System.out.println(b);
	}
	static void print(int c) {
		System.out.println(c);
	}
	/*static String print(int c) { //리턴타입과 오버로딩은 무관하다.
		System.out.println(c);
	}*/
	
}
