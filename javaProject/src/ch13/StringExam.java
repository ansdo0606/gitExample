package ch13;

public class StringExam {
	public static void main(String[] args) {
		String str1 = new String("Hello World");
		String str2 = new String("Hello World");
		System.out.println(System.identityHashCode(str1));//���� �ּҰ�
		System.out.println(System.identityHashCode(str2));
		System.out.println("==== (==) ��� ====");
		if(str1 == str2) {//�ּҰ��� ��
			System.out.println("str1�� str2�� ���� �ν��Ͻ��� �����մϴ�.");
		}else {
			System.out.println("str1�� str2�� �ٸ� �ν��Ͻ��� �����մϴ�.");
		}
		
		System.out.println("==== (equals()) ��� ====");
		if(str1.equals(str2)) {//������ ��
			System.out.println("str1�� str2�� ���� ���� ������ �ֽ��ϴ�.");
		}else {
			System.out.println("str1�� str2�� �ٸ� ���� ������ �ֽ��ϴ�.");
		}
	}
}
