package ch05;

import java.util.Scanner;

public class EqualsEx {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		while (true) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			String str = scanner.nextLine(); //���ڿ��� �Է¹ް� �ϴ� �Լ��� �ϳ�
			if (str.equals("exit")) {//������ ��������.equals("���� ����")
				//���� : ���� ���Ҷ��� "a==b"
				break;
			}else {
				System.out.println(str.length() + "���� �Դϴ�.");
				//length() : ���ڿ��� ���� ���� �� ��ȯ�ϴ� �޼ҵ� (�迭�� ���̰�)
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}

}

