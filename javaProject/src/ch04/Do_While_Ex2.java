package ch04;

import java.util.Scanner;

public class Do_While_Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		do {
			System.out.print("�ùٸ� ���� �Է��ϼ��� [1~12] : ");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		input.close();
		System.out.println("����ڰ� �Է��� ���� " +month);
	}

}
