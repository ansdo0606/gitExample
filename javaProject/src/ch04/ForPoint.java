package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		char grade=' ';
		int kor=0, eng=0, mat=0,tot;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0; i < 3; i++) {
			System.out.print("���� : ");
			kor = sc.nextInt();
			System.out.print("���� : ");
			eng = sc.nextInt();
			System.out.print("���� : ");
			mat = sc.nextInt();
			
			tot = kor+eng+mat;
			avg = tot / 3.0;
			if(avg >=89) {
				grade = '��';
			}else if(avg >=79) {
				grade = '��';
			}else if(avg >=69) {
				grade = '��';
			}else if(avg >=59) {
				grade = '��';
			}else {
				grade = '��';
			}
	
				System.out.println("======================================================");
				System.out.println("����\t����\t����\t����\t���\t���");
				System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);
				System.out.println("======================================================");
				
			}
		
	
		/*tot = kor+eng+mat;
		avg = tot / 3.0;
		
		System.out.println("======================================================");
		System.out.println("����\t����\t����\t����\t���\t���");
		 
		if(avg >=89) {
			grade = '��';
		}else if(avg >=79) {
			grade = '��';
		}else if(avg >=69) {
			grade = '��';
		}else if(avg >=59) {
			grade = '��';
		}else {
			grade = '��';
		}

			System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);

		System.out.println("======================================================");
		
	}*/ // �̷��Ե� �غôµ� ���� �´����� �� �𸣰ڽ��ϴ�...

}}
