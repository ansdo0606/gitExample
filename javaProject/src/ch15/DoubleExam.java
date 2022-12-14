package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	//2�� �̻��� ���ܰ� �Բ� �߻��� ���(�������� ���ܺ��� ó��)
	public static void main(String[] args) {
		int num = 50;
		Scanner scan = null;
		
		try {
			System.out.println("���ڸ� �Է��ϼ��� : ");
			scan = new Scanner(System.in);
			int value = scan.nextInt();
			System.out.println(num/value);
		} catch (NullPointerException e) {
			System.out.println("�������� ����");
		}catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}catch (InputMismatchException e) {
			System.out.println("������ �Է��Ҽ� �ֽ��ϴ�.");
		}catch (Exception e) {
			System.out.println("��Ÿ ����");
		}finally {//���ܿ��� ������� �׻� ����Ǵ� �ڵ�(�ʼ��ڵ�� �ƴ�)
			if (scan != null) {//if������ �ѹ� �ɷ����� ������ scan�� ���µ� 
				//������� �ϸ� finally������ �� ���ܰ� �߻��Ҽ� �ִ�.
				scan.close();
			}
		}
		System.out.println("���α׷� ����");
	}
}
