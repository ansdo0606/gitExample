package ch13;

public class AutoBox2 {
	public static void main(String[] args) {
		//�⺻�ڷ���
		int num1 = 30;
		int num2;
		int num3;
		
		// �����ڷ���
		Integer i1;//���� �������� i1�� ���� null����
		Integer i2 = new Integer(40);//auto boxing(�⺻�ڷ��� ���ͷ��� ��ü�� �ڽ�ó��)
		Integer i3 = new Integer(50);
		
		i1 = num1;//�⺻�ڷ����� int�� ��ü�ڷ����� Wrapper Class�� Intger�� ȣȯ�ȴ�.
		num2 = i2;//auto unboxing(��ü �ȿ� ����ִ� ���� Ǯ� ����)
		num3 = i3;
		
		System.out.println("�⺻�ڷ��� : "+num1+", ��ü�ڷ��� : "+i1);
		System.out.println("�⺻�ڷ��� : "+num2+", ��ü�ڷ��� : "+i2);
		System.out.println("�⺻�ڷ��� : "+num3+", ��ü�ڷ��� : "+i3);
		
	}

}
 

