package ch04;

import java.util.Scanner;

public class While_HakJum_Answer {

	public static void main(String[] args) {
		int count =0;//���������� ����� ����
		int kor, eng,mat,tot;
		double avg;
		String grade ="";
		String result = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ü ���� �Է��� ������ �������� -1�� �Է��ϼ���.");
		System.out.print("�ƹ������� �Է��ϼ��� : ");
		int n = scanner.nextInt();
		while(n != -1) {//-1�� �ԷµǸ� while���� ���
			System.out.print("���� : ");
			kor = scanner.nextInt();
			System.out.print("���� : ");
			eng = scanner.nextInt();
			System.out.print("���� : ");
			mat = scanner.nextInt();
			tot = kor+eng+mat;
			avg = tot/3.0;
			if (avg>=90) {
				grade ="��";
			}else if (avg>=80) {
				grade = "��";
			}else if (avg>=70) {
				grade = "��";
			}else if (avg>=60) {
				grade ="��";
			}else {
				grade="��";
			}
			count++;
			//a+=b; //a=a+b
			result += kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"
					+String.format("%.1f",avg)+"\t"+grade+"\n";
			System.out.print("����Ϸ��� �ƹ������� �Է��ϰų� ��ġ���� -1�� �Է��ϼ��� : ");
			n = scanner.nextInt();//-1�Է¿뵵
			
		}//while��
		System.out.println("========================================================");
		System.out.println("����\t����\t����\t����\t���\t���");
		System.out.println("--------------------------------------------------------");
		System.out.println(result);
		System.out.println("========================================================");
		scanner.close();
	}

}
