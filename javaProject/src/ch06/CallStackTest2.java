package ch06;

public class CallStackTest2 {

	public static void main(String[] args) { //���α׷� ����
		System.out.println("main(String[] args)�� ���۵Ǿ���.");
		firstMethod(); //firstMethod ȣ��
		System.out.println("main(String[] args)�� ������.");
	}//���α׷� ����

	private static void firstMethod() { //ȣ�����
		System.out.println("firstMethod()�� ���۵Ǿ���.");
		secondMethod(); //secondMethodȣ��
		System.out.println("firstMethod()�� ������."); //firstMethod����
	}

	private static void secondMethod() { //ȣ�����
		System.out.println("secondMethod()�� ���۵Ǿ���.");
		System.out.println("secondMethod()�� ������.");
	}//secondMethod ����

}
