package ch04;

import java.util.Scanner;

public class Nested_If_Score {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char lev = '0'; //A0,B0...ó��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Java ���� : ");
		score = sc.nextInt();
		sc.close();
		
		if (score >90) {
			grade = 'A';
			if(score >97) {
				lev = '+';
			}else if (score <94 ) {
				lev = '-';
			}else if (score > 80 ) {
				grade = 'B';
		}if (score < 87 ) {
			lev = '+';
	}else if (score <84 ) {
		lev = '-';

			}
		}else {
			grade ='F';
			System.out.println("����� ����Դϴ�.");
		}
		System.out.println("����� ������ " + score + "�̰� ����� " 
				+ grade + lev + " �Դϴ�.");

	}
}
		
		
		
		
		
		
