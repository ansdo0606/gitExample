package ch04;

import java.util.Scanner;

public class Ecost {

	public static void main(String[] args) {
		//��������
		String name = ""; //�̸�
		int price = 0; //���űݾ�
		int point = 0; //����Ʈ
		int point_use =0; //����Ʈ ����
		int fee = 0; //��۷�
		int pay; //���� �����ݾ�
		
		//������ �ڷ��Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = scan.next();// ���ڿ� �Է�
		System.out.print("���űݾ� : ");
		price = scan.nextInt();
		System.out.print("���� ����Ʈ : ");
		point = scan.nextInt();
		scan.close();
		
		//���
		if (price < 20000 ) {//���űݾ��� 2���� �̸��̸�
			fee = 2500;
		}
		if (point >=10000 ) {//����Ʈ�ݾ��� �������ϸ�
			point_use = point;
			pay = price + fee - point;
		}else {
			pay = price + fee;
		}
		
		//���
		System.out.println("�̸�\t���űݾ�\t��۷�\t����Ʈ���\t�����ݾ�");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
		
		
	}

}
