package ch04;

import java.util.Scanner;

public class My_First_Project {

	public static void main(String[] args) {
		int menu = 0;
		int n =0;
		Scanner scanner = new Scanner(System.in);
		
	outer:
		while (true) {
			System.out.println("== [�� ��] ==");
			System.out.println("(1) �ѽ�");
			System.out.println("(2) ���");
			System.out.println("(3) �߽�");
			System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���.(����:0) >");
			String tmp = scanner.next();
			menu = Integer.parseInt(tmp);
			if (menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if (menu <1 || menu > 3 ) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue;
			}else if (menu==1) {
				for (;;) {
				System.out.println("�ѽĸ޴��� �����ϼ���.(�ѽĸ޴� ��������:0 ,��ü����:99) >");
				System.out.println("(1) ��ġ�");
				System.out.println("(2) �����");
				System.out.println("(3) ����");
				System.out.println("(4) �����");
				tmp = scanner.next();
				n = Integer.parseInt(tmp);
					
				if (n ==0) break;
				if (n==99) break outer;
					
		switch (n) {
			case 1:
			System.out.println(">>������ ��ġ��� �����ϼ̽��ϴ�.");
				break;
			case 2:
			System.out.println(">>������ ������� �����ϼ̽��ϴ�.");
				break;
			case 3:
			System.out.println(">>������ ������ �����ϼ̽��ϴ�.");
				break;
			case 4:
			System.out.println(">>������ ������� �����ϼ̽��ϴ�.");
				break;
				}
			}
			}else if (menu ==2) {
				for(;;) {
				System.out.println("��ĸ޴��� �����ϼ���.(��ĸ޴� ��������:0 ,��ü����:99) >");
				System.out.println("(1) ���");
				System.out.println("(2) ����������ũ");
				System.out.println("(3) ī�����̽�");
				tmp = scanner.next();
				n = Integer.parseInt(tmp);
					
				if (n ==0) break;
				if (n==99) break outer;
					
		switch (n) {
			case 1:
			System.out.println(">>������ ����� �����ϼ̽��ϴ�.");
				break;
			case 2:
			System.out.println(">>������ ����������ũ�� �����ϼ̽��ϴ�.");
				break;
			case 3:
			System.out.println(">>������ ī�����̽��� �����ϼ̽��ϴ�.");
				break;
			}
		}
			}else if (menu ==3) {
				for(;;) {
				System.out.println("�߽ĸ޴��� �����ϼ���.(�߽ĸ޴� ��������:0 ,��ü����:99) >");
				System.out.println("(1) ¥���");
				System.out.println("(2) «��");
				System.out.println("(3) ������");
				tmp = scanner.next();
				n = Integer.parseInt(tmp);
					
				if (n ==0) break;
				if (n==99) break outer;
					
			switch (n) {
				case 1:
				System.out.println(">>������ ¥����� �����ϼ̽��ϴ�.");
					break;
				case 2:
				System.out.println(">>������ «���� �����ϼ̽��ϴ�.");
					break;
				case 3:
				System.out.println(">>������ �������� �����ϼ̽��ϴ�.");
					break;
				}
			}
		}	
	 }
		System.out.println("���α׷��� ��� �����մϴ�.");
	}
}
	


 