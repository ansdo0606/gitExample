package ch15;

public class ExceptionExam {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
			c = a/b;
			System.out.println(c);
			
		} catch (ArithmeticException e) {//�� �𸦶� Exeption�� �ص� �ȴ�.
			System.out.println("0���� ���� �� �����ϴ�.");
			e.printStackTrace();//���ܰ� �߻��� ������ ���� ���� ���(������ ������ �޼ҵ�)
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
