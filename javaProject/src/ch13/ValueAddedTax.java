package ch13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValueAddedTax {
	public static double valueOfSupply;//���ް���
	public static int vatRate = 10; //�ΰ�����
	public static double getVat() {//�ΰ������
		return valueOfSupply / vatRate;
	}
	public static double getTotal() {//�ΰ��������հ�
		return valueOfSupply + getVat();
	}
	
	public static void main(String[] args) {
		DecimalFormat decFormat = new DecimalFormat("###,###");
		Scanner sc = new Scanner(System.in);
		System.out.print("���ް����� �Է��ϼ��� : ");
		ValueAddedTax.valueOfSupply = Integer.parseInt(sc.nextLine());
		System.out.println("**********************************");
		try {
			System.out.println("���ް��� : " + decFormat.format((int)valueOfSupply) + "��");
			System.out.println("�ΰ���ġ���� : " + vatRate + "%");
			System.out.println("�ΰ���ġ�� : " + decFormat.format((int)getVat()) + "��");
			System.out.println("�հ� : " + decFormat.format((int)getTotal())+ "��");
			
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		System.out.println("**********************************");
		sc.close();
		System.out.println("���α׷��� �����մϴ�.");
	}
}
