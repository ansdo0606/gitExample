package ch06;

import java.util.Scanner;

public class HolidayEx {

	static int y; //��������,�ʵ�,�������(Ŭ���� ��ü���� ����Ҽ� �ִ� ����)
	
	static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ټӿ����� �Է��ϼ��� : ");
		y = scanner.nextInt();
		scanner.close();
	}
	
	static int holiday(int year) {
		int day = 0; //day�� ���������� �ƴ� �������� (�ش� �޼ҵ� �������� ��밡��)
		if (year <= 5) { //�ټӳ�� 1~5��
			day = 10; //10�� �ް�
		}else if (year <= 10) { //6~10�� ����
			day = 15;
		}else {//�׿� (11�� �̻�)
			day = 20;
		}
		return day;
	}
	
	public static void main(String[] args) {
		input();
		System.out.println("�ް��ϼ� : "+holiday(y));
	}

}
