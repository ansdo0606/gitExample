package ch04;

public class BreakEx4 {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		int n = 1;
		while (true) {
			System.out.println(n++ + " Hello World");
			if (n>=8) break;
	}
		System.out.println("n���� 8�̸� while�� ��������" );
		System.out.println("----------------------------");

}
}