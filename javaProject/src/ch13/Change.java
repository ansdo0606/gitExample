package ch13;

public class Change {//���� ��ȯ
	public static void main(String[] args) {
		int a=10;//�ݶ���
		int b=20;//���̴���
		int temp;//����� ��
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}
