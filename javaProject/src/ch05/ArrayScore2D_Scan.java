package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {

		Scanner scnner = new Scanner(System.in); 

		System.out.print("�л����� �Է��Ͻÿ� : "); 
		int num = scnner.nextInt();
		int[][] score = new int[num][3]; 
		char[] grade = new char[num];

		System.out.println("��, ��, �� ������ ���� �Է��ϼ��� :");

		for (int i = 0; i < score.length; i++) {

			System.out.println(i + 1 + "�� �л��� ���� : ");
			for (int j = 0; j < score[i].length; j++) { //������ �迭�� ���
				score[i][j] = scnner.nextInt();
			}
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("�й�\t����\t����\t����\t����\t���\t���");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;//���� �ۿ��� �ؾ������� �ȿ��� �ص� �Ǳ� ��
			float avg = 0.0f;//���

			System.out.print((i + 1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t");
			sum = score[i][0] + score[i][1] + score[i][2];
			avg = sum / (float) score[i].length;//��հ��
			//����,��� ���

			if (avg > 90) {
				grade[i] = 'A';
			} else if (avg > 80) {
				grade[i] = 'B';
			} else if (avg > 70) {
				grade[i] = 'C';
			} else if (avg > 60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}

			System.out.printf("%d\t%3.1f\t%c\n", sum, avg, grade[i]);
			
			
		}
		System.out.println("-----------------------------------------------------------");
		scnner.close();
	}

}


