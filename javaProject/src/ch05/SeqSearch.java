package ch05;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		int s[] = {0,10,20,30,40,50,60,70,80,90,100};
		int value, index = -1; //index�� -1�� �ʱ�ȭ
		Scanner scanner = new Scanner(System.in);
		System.out.println("(���� : 0 10 20 30 40 50 60 70 80 90 100)");
		System.out.print("�� ���� �� Ž���� ���� �Է��ϼ��� : ");
		value =scanner.nextInt();
		scanner.close();
		for (int i = 0; i < s.length; i++) {
			if (s[i]==value) { //���� ��
				index = i; //�Է��� ���ڿ� for���� ���鼭 ���������� �迭�ε����� �ִ� ���� 
				//���ؼ� ������ ����
			}
		}
		if (index < s.length && index >= 0) { //true&&true => true
			System.out.println(""+value+"���� index"+index+"�� ��ġ�� �ֽ��ϴ�.");
		}
	}

}
