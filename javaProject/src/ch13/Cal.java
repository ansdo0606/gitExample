package ch13;

import java.util.Date;
import java.util.Calendar;

public class Cal {
	public static void main(String[] args) {
		//Calendar �ν��Ͻ� ������ new�� ������ �ʴ´�
		Calendar cal =Calendar.getInstance();//static
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);//���� 0~11(+1�� �ؾ���)
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR));//12�ð���
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));//24�ð���
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM));//����0,����1
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		//1���� ���° ��
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//���� ���° ��
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//����
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		String yoil ="";
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:yoil = "�Ͽ���";	break;
		case 2:yoil = "������";	break;
		case 3:yoil = "ȭ����";	break;
		case 4:yoil = "������";	break;
		case 5:yoil = "�����";	break;
		case 6:yoil = "�ݿ���";	break;
		case 7:yoil = "�����";	break;

		
		}
		System.out.println("������ "+yoil+"�Դϴ�.");
		//1���߿� ���° ��
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		Date date=cal.getTime();
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		
	}
}
