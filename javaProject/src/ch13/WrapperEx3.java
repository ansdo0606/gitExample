package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data = {'H','e','l','l','o','1','2','3','4'};
		System.out.println("-----------------------------------------------");
		System.out.println("(Character ���)");
		for (int i = 0; i < data.length; i++) {
			if (Character.isUpperCase(data[i])) {//�빮�ڸ� true
				System.out.println(data[i]+"==>�빮��");
			}else if (Character.isLowerCase(data[i])) {//�ҹ��ڸ� true
				System.out.println(data[i]+"==>�ҹ���");
			}else if (Character.isDigit(data[i])) {
				System.out.println(data[i]+"==> ����");
			}else {
				System.out.println(data[i]+"==>��Ÿ����");
			}
		}
		System.out.println();
		System.out.println("(Integer ���)");
		System.out.println("���� "+Integer.toString(1234)+"�Դϴ�.");//������ ���ڿ��� ��ȯ
		System.out.println("���� "+Integer.parseInt("1234")+"�Դϴ�.");//���ڿ� "200"�� 10������ ��ȯ
		System.out.println("���� 1234+2 = "+(Integer.parseInt("1234")+2)+"�Դϴ�.");//
		System.out.println("-----------------------------------------------");
	}
}
