package ch02;

import java.util.Scanner;

public class Add_input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//�������� ����
		int x;
		int y;
		int sum;
		// �������� �ʱ�ȭ(������ ���� ����)
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();//������ int�� nextInt()�� �޴´�.
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		y = input.nextInt();
		
		sum = x+y;
		System.out.println(sum);
		input.close();
	}

}
