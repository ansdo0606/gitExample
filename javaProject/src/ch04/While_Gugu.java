package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �߿��� ����ϰ��� �ϴ� ���� �Է��ϼ��� : ");
		int dan = 2;
		int j = 1; 
		
		dan=sc.nextInt();
		
		while (j<=9) {
			System.out.println(dan+" X "+j+" = "+ (dan*j));
			j++;
	}

}
}
