package ch03;

import java.util.Scanner;

public class Point {
//����,����,���� ������ �Է¹޾Ƽ� ����,��� ���
	public static void main(String[] args) {
		//���� ����
		String name;
		int kor , eng , mat , tot;
		double avg;
		//�Է°�ü ����
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = scan.next();//���ڿ� �Է�
		System.out.print("���� ���� : ");
		kor = scan.nextInt();//���ڿ� �Է�
		System.out.print("���� ���� : ");
		eng = scan.nextInt();//���ڿ� �Է�
		System.out.print("���� ���� : ");
		mat = scan.nextInt();//���ڿ� �Է�
		scan.close();
		
		//���
		tot = kor + eng + mat;//����
		avg = tot / 3.0;
		
		//��� ���
		System.out.println("===================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("-----------------------------------");
		System.out.println(name + "\t"+ kor + "\t" + eng +"\t" + mat + "\t" + tot + "\t" + avg);

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f" , name,kor,eng,mat,tot,avg);
		System.out.println();
		System.out.println(String.format("%s\t%d\t%d\t%d\t%d\t%.1f" , name,kor,eng,mat,tot,avg));
	}

}
