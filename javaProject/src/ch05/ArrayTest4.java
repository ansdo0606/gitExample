package ch05;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		size = scanner.nextInt();
		int[] scores = new int[size]; //����� �Է°����� �迭�� ũ�⸦ ����
		for (int i = 0; i < scores.length; i++) { // �̶��� �ݵ�� ��������.length�� ����Ѵ�.
			System.out.println("������ �Է��ϼ��� : ");
			scores[i] = scanner.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			total += scores[i]; //total + total+scores[i]
		}
		System.out.println("��� ������ : "+total/scores.length+"�Դϴ�.");
		scanner.close();
		
	}

}
