package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		//�빮�ڷ� ����
		System.out.println(str.toUpperCase());
		//�ҹ��ڷ� ����
		System.out.println(str.toLowerCase());
		System.out.println(str);//������ �ٲ��� ����(�Һ���)
		str = str.toLowerCase();//���� str�ּҰ���  �������� toLowerCase�� �ִ� ���ڿ��� ���ο���
		System.out.println(str);
		
		str="";//��(null) ���ڿ�('\0')ó��
		System.out.println(str);
		str= null;//�����ϴ� ������ ����
		System.out.println(str);
		
		char ch = '\0';//null����
		System.out.println("���� : "+ch+",code : "+(int)ch);
		ch = ' ';//�ܹ��� �ʱ�ȭ
		System.out.println("���� : "+ch+",code : "+(int)ch);
	}
}
