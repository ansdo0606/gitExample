package ch02;

public class CharEx {

	public static void main(String[] args) {
		char aValue ='\u0041';//�����ڵ� 0041�� �빮�� A�̴�.
		System.out.println("char��('\u0041') : " + aValue);
		
		char bValue ='\u0041';//�����ڵ� 0041�� �빮�� A�̴�.
		System.out.println("char��(\'\\u0041\') : " + bValue);
		// \'= single quote�� ǥ��
		// \\=��������(BackSlash)�� ǥ��
	}

}
