package ch04;

public class Do_While_Char {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1);//������ ��� 1�� ���ϸ� ���������� �ڵ尪
		} while (c <= 'z');
		
	}

}
