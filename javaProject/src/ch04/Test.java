package ch04;


public class Test {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
		switch (i%5) {
		case 0:System.out.println(i+" : 5�� ����Դϴ�.");
			
			break;

		default: System.out.println(i+" : 5�� ����� �ƴմϴ�.");
			break;
		}
		}
	}
}