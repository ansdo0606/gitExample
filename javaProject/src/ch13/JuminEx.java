package ch13;

import java.util.Calendar;
import java.util.Scanner;

public class JuminEx {
	public static void main(String[] args) {
		String jumin = "",gender="",season="";
		Calendar cal=Calendar.getInstance();
		Scanner scan=new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(-�� �����ؼ� �Է�) : ");
		
		jumin = scan.next();
		scan.close();
		int age=Integer.parseInt(jumin.substring(0,2));
		char s=jumin.charAt(7);//����ó��(1,3):����,(2,4):����
		if (s=='1'|| s=='3') {
			gender="��";
		}else if (s=='2' || s=='4') {
			gender="��";
		}else {
			gender="�ܱ���";
		}
		//���̱��ϱ�
		if (s=='1' || s=='2') {
			age=(cal.get(Calendar.YEAR)-(1900+age)+1);
		}else  if (s=='3'||s=='4') {
			age=(cal.get(Calendar.YEAR)-(2000+age)+1);
		}
		//�������ϱ�
		String w=jumin.substring(2, 4);
		switch (w) {
		case "12":case "01":case "02": season="�ܿ�"; break;
		case "03":case "04":case "05": season="��"; break;
		case "06":case "07":case "08": season="����"; break;
		case "09":case "10":case "11": season="����"; break;
		}
		
		System.out.println("�ֹε�Ϲ�ȣ : "+jumin);
		System.out.println("���� : "+gender);
		System.out.println("���� : "+age);
		System.out.println("�¾ ���� : "+season);
	}
}
