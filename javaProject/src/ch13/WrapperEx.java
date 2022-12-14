package ch13;

//Wrapper class : �⺻�ڷ����� �����ϴ� Ŭ����
//�⺻�ڷ����� ���� �پ��� method�� ����
//byte		Byte
//short		Short
//int		Integer
//float		Float
//double	Double
//char		Character
//boolean	Boolean

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1=10;
		Integer i2 = new Integer(20);//auto boxing
		int num1=i1.intValue();
		int num2=i2;//auto unboxing(��ü�� ����� value�� ������ �۾���)
		int sum=num1+num2;
		System.out.println(sum);
		//2���� ���ڿ��� 
		System.out.println(Integer.toBinaryString(sum));
		//8���� ���ڿ���
		System.out.println(Integer.toOctalString(sum));
		//16����
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE);//������ �ִ밪
		System.out.println(Integer.MIN_VALUE);//������ �ּҰ�
		System.out.println(Integer.parseInt("100"));
		//������ ���ڿ���
		System.out.println(Integer.toString(100));
		System.out.println(100+"");
		
	}
}
