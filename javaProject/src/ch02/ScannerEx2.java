package ch02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();//���ڿ��� �Է¹��� �� �ִ� �޼ҵ�(�Լ�)
		System.out.print("���̸� �Է��ϼ��� : ");
		short age = scan.nextShort();
		System.out.print("������ ������ �ݾ��� �Է��ϼ��� : ");
		int money = scan.nextInt();
		System.out.print("������ ��������� �Ÿ��� m������ �Է��ϼ��� : ");
		long distance = scan.nextLong();
		System.out.print("����(Ű)�� �Է��ϼ��� : ");
		float height = scan.nextFloat();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		double weight = scan.nextDouble();
		System.out.println("==========================");
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ���̴� " + age + "�Դϴ�.");
		System.out.println("����� ���� cash�� " + money + "�Դϴ�.");
		System.out.println("����� ��ٰŸ���  " + distance + "m�Դϴ�.");
		System.out.println("����� ������ " + height + "�Դϴ�.");
		System.out.println("����� �����Դ� " + weight + "�Դϴ�.");
		scan.close();//��ĵ��ü�� ���� (�޸𸮻󿡼� ����)
		
	}

}
