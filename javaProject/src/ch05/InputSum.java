package ch05;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		int[] num=new int [5]; //5���� ���̸� ���� ������ ����
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� : ");
			num[i]=scanner.nextInt();
			// num[0] = 5, num[1]=3 ...num[4]=?
			sum=sum+num[i];
		}
		System.out.println("�հ� : "+sum);
		scanner.close();
	}

}
