package ch04;

public class BreckEx4_Answer {

	public static void main(String[] args) {
		int n=1;
		while (n <= 10) {
			System.out.println(n + "Hello World");
			n++;
			if (n==8) {
				break;//n���� 8�϶� ��������
			}
		}//while��
		System.out.println("n���� 8�̸� while�� ��������");
	}

}
