package ch04;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;//���丮���� ���� �ſ� Ŀ�� �� �־ long���� ����
		//ex)3! =3X2X1
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		n= scan.nextInt();
		scan.close();
		
		for (int i = 1; i <=n; i++) {
			fact =fact*i;
		}
				System.out.printf("%d!�� %d�Դϴ�.",n,fact);
	}

}
