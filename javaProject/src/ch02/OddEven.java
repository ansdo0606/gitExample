package ch02;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = in.nextInt();
		System.out.println(num % 2 ==0 ? "¦��" : "Ȧ��");//3�� ������
		//3�� ������(1��(���ǽ�) ? 2��(t) : 3�� (f))
		in.close();
	}

}
