package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue ='\uC815';
		char bValue ='\uBB38';
		char cValue ='\uC560';
		
		System.out.println("정  문  애 ");
		
		System.out.println("char형(\'\\uC815\') : " + aValue);
		System.out.println("char형(\'\\uBB38\') : " + bValue);
		System.out.println("char형(\'\\uC560\') : " + cValue);
	}
}


