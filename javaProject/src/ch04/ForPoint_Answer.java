package ch04;

import java.util.Scanner;

public class ForPoint_Answer {

	public static void main(String[] args) {
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		String grade = "";
		String result = "";//���� ��¿�
		
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <=3; i++) {
			System.out.print("���� : ");
			kor = scan.nextInt();
			System.out.print("���� : ");
			eng = scan.nextInt();
			System.out.print("���� : ");
			mat = scan.nextInt();
			tot = kor+eng+mat;
			avg = tot/3.0;
			
			if (avg >=90 ) {
				grade ="��";
			}else if (avg >= 80) {
				grade = "��";
			}else if (avg >= 70) {
				grade = "��";
			}else if (avg >= 60) {
				grade = "��";
			}else {
				grade = "��";
			}
			result += kor+"\t"+ eng+"\t"+mat+"\t"+tot+"\t"
					+String.format("%.1f", avg)+"\t"+grade+"\n";
			}//for
		//���
		System.out.println("==============================================");
		System.out.println("����\t����\t����\t����\t���\t���");
		System.out.println("----------------------------------------------");
		System.out.println(result);
		System.out.println("==============================================");
	}

}
