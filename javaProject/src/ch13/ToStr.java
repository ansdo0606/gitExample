package ch13;

public class ToStr {//extends Object
	public static void main(String[] args) {
		Object obj = new Object();
		obj = new Integer(20);//��:��,��:�� => ������
		//������������ ���� �ּҰ��� ������ jdk1.5���ʹ� value�� ���� �ֵ��� 
		//����ó��(intValue()���� ȣ��)�ϵ��� �ߴ�.(Auto Boxingó��)
		//obj = 20;
		System.out.println(obj);//��ü => �Ϲ� (Auto Unboxingó��)
		obj = new Double(20.5);
		//obj = 20.5;
		System.out.println(obj);
		obj = "hello";
		System.out.println(obj);
		
	}
}
