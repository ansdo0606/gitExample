package ch04;

import java.util.Scanner;

public class Do_While_Random {

	public static void main(String[] args) {
		int input =0;
		int answer = 0;
		answer = (int)(Math.random()*10)+1;//1~10������ ������ ���� �߻�
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("1��10������ ������ �Է��ϼ��� > ");
			String tmp = scanner.next();//����ڰ� ���������� �ڷ��Է�
			input = Integer.parseInt(tmp);//�������� ���������� ��ȯ
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			}else if (input < answer) {
				System.out.println("�� ū���� �ٽ� �õ��غ�����.");
			}
			
		} while (input != answer);
		scanner.close();
		System.out.println("�����Դϴ�.");
	}

}
