package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan_Answer {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in); 
			System.out.print("�л����� �Է��Ͻÿ� : "); 
			int m = scanner.nextInt();
			int n = 3;
			int[][] score = new int[m][n];
			System.out.println("��, ��, �� ������ ���� �Է��ϼ��� :");
			for (int i = 0; i < m; i++) {
				System.out.println(i + 1 + "�� �л��� ���� : ");
				for (int j = 0; j < n; j++) {
					score[i][j]=scanner.nextInt();
				}
			}
			System.out.println("�й�\t����\t����\t����\t����\t���\t���");
			for (int i = 0; i < score.length; i++) {
				int sum =0;//����
				float avg = 0.0f;//���
				char grade = ' ';
				
				System.out.printf("d%\t",i+1);//��ȣ���
				for (int j = 0; j < score[i].length; j++) {
					sum += score[i][j];
					System.out.printf("%d\t",score[i][j]);
				}
				avg = sum/(float)score[i].length;//��հ��
				switch ((int)(avg/10)) {//float�� int�� ��ȯ
				case 10:
				case 9:
					grade = 'A';
					break;
				case 8:
					grade = 'B';
					break;
				case 7:
					grade = 'C';
					break;
				case 6:
					grade = 'D';
					break;
				default:
					grade ='F';
					
				}
				//���
				System.out.printf("%d\t%.1f\t%s%n",sum,avg,grade);
			}
			
		scanner.close();
		}

	}


