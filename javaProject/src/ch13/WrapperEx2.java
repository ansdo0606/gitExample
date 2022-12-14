package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		//Character
		System.out.println(Character.toLowerCase('A'));//�빮�ڸ� �ҹ��ڷ� ��ȯ
		char c1='4',c2='F';
		if (Character.isDigit(c1)) 
			System.out.println(c1+"�� ����");
		if (Character.isAlphabetic(c2)) 
			System.out.println(c2+"�� ������");
		
		//Integer
		System.out.println(Integer.parseInt("200"));//���ڿ� "200"�� 10������ ��ȯ
		System.out.println(Integer.toString(200));//������ ���ڿ��� ��ȯ
		System.out.println(Integer.toBinaryString(200));//���� 200�� 2���� ���ڿ��� ��ȯ
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());//������ �Ǽ������� ��ȯ(unboxing)
		
		//Double 
		Double d=new Double(3.14);
		System.out.println(d.toString());//�Ǽ��� ���ڿ��� ��ȯ
		System.out.println(Double.parseDouble("3.14"));//���ڿ��� �Ǽ��� ��ȯ
		
		//Boolean
		boolean b =(4>3);//true
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));//false���ڿ��� boolean�� false�� ��ȯ
		
		
	}
}
