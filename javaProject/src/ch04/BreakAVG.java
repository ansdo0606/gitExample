package ch04;

import java.awt.TexturePaint;
import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("������ �Է��ϼ��� : ");
			int num = scanner.nextInt();
			if (num<0) //-���� �Է��ؾ� ����(ex-1)
				break;//if�� ���� ����¥���� {} ���� ����
			total += num;//total =total+num
			count++;
		}
		System.out.println("����� "+ total/count);
		scanner.close();
	}

}
