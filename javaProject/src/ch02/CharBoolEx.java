package ch02;

public class CharBoolEx {

	public static void main(String[] args) {
		char ga1 = '��';
		char ga2 = '\uAC00';
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println(ga2);
		System.out.println(cham + "�� �ƴϸ�" + geojit + "�Դϴ�.");
	}

}
