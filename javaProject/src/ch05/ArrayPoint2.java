package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		String name []= { " ", " "};
		int kor [] = new int[2];
		int eng [] = new int[2];
		int mat [] = new int[2];
		int tot [] = new int[2];
		double avg [] = new double[2];
		double tot_avg=0;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("2���� �л��� ��,��,�� ������ ���� �Է��ϼ���.");
		
		for(int i=0; i<name.length; i++) {
			System.out.print("�̸� : ");
			name[i] = scanner.next();
			System.out.print("���� : ");
			kor[i] = scanner.nextInt();
			System.out.print("���� : ");
			eng[i] = scanner.nextInt();
			System.out.print("���� : ");
			mat[i] = scanner.nextInt();
			
			tot[i] = kor[i]+eng[i]+mat[i];
			avg[i] = tot[i]/3.0;
			tot_avg = tot_avg+avg[i];
		}
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+
		tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		
		
	System.out.println("========================================================");
	System.out.println("�б���� : " + String.format("%.1f", tot_avg/name.length));
	scanner.close();
	}
}

