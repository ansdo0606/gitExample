package ch13;

public class AutoBox {

	public static void main(String[] args) {
		//�⺻�ڷ���
		int num1 = 10;
		int num2;
		
		// �����ڷ���
		Integer i1;//���� �������� i1�� ���� null����
		Integer i2 = new Integer(20);//auto boxing(�⺻�ڷ��� ���ͷ��� ��ü�� �ڽ�ó��)
		
		i1 = num1;//�⺻�ڷ����� int�� ��ü�ڷ����� Wrapper Class�� Intger�� ȣȯ�ȴ�.
		num2 = i2;//auto unboxing(��ü �ȿ� ����ִ� ���� Ǯ� ����)
		
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
	}

}
