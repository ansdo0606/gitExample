package ch04;

import java.util.Scanner;

public class While_Point2 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����,����,���� ������ �����Է��ϰ� �������� -1�� �Է��ϼ���.");
		int n = scanner.nextInt();
		while (n != -1) {//-1�� �Է��� �Ǹ� while�� ���
			sum += n;//sum=sum+n
			count++;
			n = scanner.nextInt();//-1�Է¿뵵
		}
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			
		}else {
			System.out.printf("������ %d�̰� ����� %4.1f �Դϴ�.",sum,(double)sum/count);
		}
		scanner.close();
	}

}
