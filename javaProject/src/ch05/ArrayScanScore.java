package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int total = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����ó���� �л����� �Է��ϼ��� >> ");
		n = scan.nextInt();
		
		int[] score = new int[n];
		for(int i =0; i<score.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = scan.nextInt();
		}
		for(int i = 0; i<score.length; i++) {
			
			total += score[i]; 
		}
		System.out.println("===================================");
		System.out.println("������ : "+ total + "�� �Դϴ�.");
		System.out.println("����� : "+ total/score.length + "�� �Դϴ�.");
		scan.close();
	}

}
