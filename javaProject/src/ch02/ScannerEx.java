package ch02;

import java.util.Scanner;
//java.lang ��Ű���� �⺻��Ű���μ� import�� ���ص� ������ �� ���� ��Ű���� import��� ���� �ؾ��Ѵ�.
//Ű����κ����� ����� �Է� ���α׷�
public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + shift + O : �ڵ� import�� ���ִ� hot key
		Scanner in = new Scanner(System.in);
		System.out.println("ù��° ������ : ");// dkssoansrn
		int x = in.nextInt();//�������� Ű����κ��� �޾� ó���ϴ� �żҵ�
		System.out.println("�ι�° ������ : ");
		int y = in.nextInt();
		System.out.printf("%d * %d�� %d�Դϴ�.\n", x, y, x*y);
		in.close();
		
	}

}
