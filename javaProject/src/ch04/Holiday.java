package ch04;

import java.util.Scanner;

//�ް��ϼ� ���
		//�ټӿ��� 1~3�� ==> 3��, 4~9�� ==>5��
		//�ټӿ��� 10�� �̻� 10��, 20�� �̻� ==> 20��
public class Holiday {

	public static void main(String[] args) {
		//���� ����
		int year;
		int days;
		
		//������ �Է�
		Scanner scan= new Scanner(System.in);
		System.out.print("�ټӿ����� �Է��ϼ��� : ");
		year = scan.nextInt();//Ű����κ��� ���ڸ� �Է¹���
		scan.close();
		
		//���
		if (year <= 3) {
			days = 3;
		}else if (year <10) {
			days =5;
		}else if (year <20) {
			days =10;
		}else  {//�׿� ��� ���
			days =20;
		}
		//���
		System.out.println("����� �ټ� ������ " + year+"���̰� ");
		System.out.println("�ް��ϼ��� "+ days + "���Դϴ�.");
	}

}
