package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int total = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적처리할 학생수를 입력하세요 >> ");
		n = scan.nextInt();
		
		int[] score = new int[n];
		for(int i =0; i<score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i<score.length; i++) {
			
			total += score[i]; 
		}
		System.out.println("===================================");
		System.out.println("총점은 : "+ total + "점 입니다.");
		System.out.println("평균은 : "+ total/score.length + "점 입니다.");
		scan.close();
	}

}
