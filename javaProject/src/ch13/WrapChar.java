package ch13;

public class WrapChar {
	public static void main(String[] args) {
		char[] data = {'J','a','v','a','1','#'};
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
	}
}
