package ch04;

import java.util.Scanner;

public class WhileMenu {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("(1) �Ƹ޸�ī��");
			System.out.println("(2) ī���");
			System.out.println("(3) ����������");
			System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���. (����:0) > ");
			String tmp = scanner.next();//����ó��
			menu = Integer.parseInt(tmp);//���ڸ� ���ڷ� ��ȯ("1"=>1)
			if (menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if (menu <1 || menu > 3) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� "+ menu + "�� �Դϴ�.");
		}
		scanner.close();
		}
	}


