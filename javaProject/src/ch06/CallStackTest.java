package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
		
	} //���α׷� �� �׻� ���� �޼ҵ尡 �߿��ϴ�.

	private static void firstMethod() {
		secondMethod();
	}

	private static void secondMethod() {
		System.out.println("secondMethod();");
	}

}
