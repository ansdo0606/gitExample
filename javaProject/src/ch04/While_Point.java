package ch04;

import java.util.Scanner;

public class While_Point {

	public static void main(String[] args) {
		int total =0;//�ʱ�� ����
		Scanner input = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int num = input.nextInt();
		
		while (num != 0) {//���ǽ�(0�� �Է��ϱ� ������ ���ѷ���(�ݺ�))
			total += num;
			System.out.println("���� ������ �� : " + total);
			System.out.println("����Է��ϼ���.(���Ḧ ���ϸ� 0�� �Է��ϼ���)");
			num = input.nextInt();//���ǽ��� ���ѷ����� �������� �뵵�ε� Ȱ��
			
			
		}
		System.out.println("�� ������ : " + total);
		System.out.println("���α׷��� �����մϴ�.");
		input.close();
	}

}
