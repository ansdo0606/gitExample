package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		//3�ڸ��� �޸� ǥ��
		//1)String�� Ȱ��
		int val = 1234000000;
		String str = String.format("%,d", val);
		System.out.println(str);
		
		//2)DecimalFormat�� Ȱ��
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(1234000000.3232323);
		System.out.println(num);
		
		//3)NumberFormat�� Ȱ��
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(1234000000.1234);
		System.out.println(num2);
		
		//getIndtance(Locale.����)- �ش籹�� ǥ���,�⺻�� Locale.US�̴�.
		NumberFormat nf2 = NumberFormat.getInstance(Locale.ITALY);
		String num3 = nf2.format(1234000000.1234);
		System.out.println(num3);
	}
}
