package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue ='\uC815';
		char bValue ='\uBB38';
		char cValue ='\uC560';
		
		System.out.println("��  ��  �� ");
		
		System.out.println("char��(\'\\uC815\') : " + aValue);
		System.out.println("char��(\'\\uBB38\') : " + bValue);
		System.out.println("char��(\'\\uC560\') : " + cValue);
	}
}


