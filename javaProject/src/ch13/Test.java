package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));
		System.out.println(Math.round(10.5));
		System.out.println(Math.floor(10.9));
		System.out.println(Math.pow(10, 3));
		System.out.println(Math.pow(2, 3));
		Random rand = new Random();
		System.out.println("������ : "+rand.nextInt(100));//100������ �������� �߻�
		System.out.println("�Ǽ��� : "+rand.nextDouble());//100������ �����Ǽ� �߻�
	
		int a = 10;//�⺻�ڷ���
		
		Integer b= 20;//��ü�ڷ���(Wrapper Ŭ����),������������ ����,intVaule()�� �۵�
		Integer c= new Integer(20);//���Ĺ���
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
		
		
	}

}
