package ch04;

import java.util.Scanner;

public class ForPoint {

	public static void main(String[] args) {
		char grade=' ';
		int kor=0, eng=0, mat=0,tot;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0; i < 3; i++) {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			mat = sc.nextInt();
			
			tot = kor+eng+mat;
			avg = tot / 3.0;
			if(avg >=89) {
				grade = '수';
			}else if(avg >=79) {
				grade = '우';
			}else if(avg >=69) {
				grade = '미';
			}else if(avg >=59) {
				grade = '양';
			}else {
				grade = '가';
			}
	
				System.out.println("======================================================");
				System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
				System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);
				System.out.println("======================================================");
				
			}
		
	
		/*tot = kor+eng+mat;
		avg = tot / 3.0;
		
		System.out.println("======================================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		 
		if(avg >=89) {
			grade = '수';
		}else if(avg >=79) {
			grade = '우';
		}else if(avg >=69) {
			grade = '미';
		}else if(avg >=59) {
			grade = '양';
		}else {
			grade = '가';
		}

			System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);

		System.out.println("======================================================");
		
	}*/ // 이렇게도 해봤는데 뭐가 맞는지는 잘 모르겠습니다...

}}
