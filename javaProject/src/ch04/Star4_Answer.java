package ch04;

import java.util.Scanner;
public class Star4_Answer {

	public static void main(String[] args) {
		System.out.print("Ȧ���� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i<=num/2) {//���ʿ���
					if(i+j<=num/2-1) {//���� �������
						System.out.print(" ");
					}else if(j-i>=num/2+1) {//������ ����
						System.out.print(" ");
					}else {
						System.out.print("*");
					}//inner if else
				}else if(i>num/2) {//�Ʒ��� ����
					if(i-j>=num/2+1) {//���� ����
						System.out.print(" ");
					}else if(i+j>=num/2*3+1) {//������ ����
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}//outer if else��
			}//inner for��
			System.out.println();
		}//outer for��
		sc.close();
	}//end main()

}