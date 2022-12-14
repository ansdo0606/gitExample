package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {

		Scanner scnner = new Scanner(System.in); 

		System.out.print("학생수를 입력하시오 : "); 
		int num = scnner.nextInt();
		int[][] score = new int[num][3]; 
		char[] grade = new char[num];

		System.out.println("국, 영, 수 점수를 각각 입력하세요 :");

		for (int i = 0; i < score.length; i++) {

			System.out.println(i + 1 + "번 학생의 점수 : ");
			for (int j = 0; j < score[i].length; j++) { //국영수 배열값 출력
				score[i][j] = scnner.nextInt();
			}
		}

		System.out.println("-----------------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;//총점 밖에서 해야하지만 안에서 해도 되긴 함
			float avg = 0.0f;//평균

			System.out.print((i + 1) + "\t" + score[i][0] + "\t" + score[i][1] + "\t" + score[i][2] + "\t");
			sum = score[i][0] + score[i][1] + score[i][2];
			avg = sum / (float) score[i].length;//평균계산
			//총점,평균 출력

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


