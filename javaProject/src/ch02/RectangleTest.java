package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���簢���� ���� ���̸� �Է��ϼ��� : ");
		int x = in.nextInt();
		System.out.println("���簢���� ���� ���̸� �Է��ϼ��� : ");
		int y = in.nextInt();
		System.out.printf("���簢���� ���̴� %d�Դϴ�.\n", x*y);
		in.close();
		
	}

}
