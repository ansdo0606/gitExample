package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random generato = new Random();//������ �߻���Ű�� ������ü�̴�.
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� : ");
		int count = scan.nextInt();
		int sum = 0;
		scan.close();
		
		for (int i = 0; i <count; i++) {
			int number = generato.nextInt(100);//0~99������ �����߻�
			System.out.println("������ ���� : "+ number);
			sum += number;//sum=sum+number
		}
		System.out.print("���� " + count + "���� ���� " + sum);
	}

}
