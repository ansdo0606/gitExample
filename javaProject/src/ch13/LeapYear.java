package ch13;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int year = scan.nextInt();
		GregorianCalendar cal=new GregorianCalendar();
		//if (cal.isLeapYear(year)) {//������ �޼ҵ�:isLeapYear
			//System.out.println("�����Դϴ�.");
		if((year%4==0 && year%100 !=0) || year%400 == 0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}
	}
}
