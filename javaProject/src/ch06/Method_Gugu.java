package ch06;

import java.util.Scanner;


public class Method_Gugu {

	public static void main(String[] args) {
		int dan;
		System.out.print("���� �Է��ϼ��� : ");
		Scanner scanner = new Scanner(System.in);
		dan = scanner.nextInt();
		gugu(dan);
		scanner.close();
	}//���α׷� ��
	//void�� ����Ÿ���� ���ٴ°��� �ǹ��ϴ� Ű����
	public static void gugu(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
	}

}
