package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
		
	} //프로그램 끝 항상 메인 메소드가 중요하다.

	private static void firstMethod() {
		secondMethod();
	}

	private static void secondMethod() {
		System.out.println("secondMethod();");
	}

}
