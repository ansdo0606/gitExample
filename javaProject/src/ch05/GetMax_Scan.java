package ch05;

import java.util.Scanner;

public class GetMax_Scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] =new int[5]; //�迭 ����
		int max = 0; //�ִ밪ó���� ����
		System.out.println("��� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			//�Է¹��� ������ �迭�� ����
			if (intArray[i] > max) {
				max = intArray[i]; // intArray[i]�� max�� ����
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		scanner.close();
		
	}

}