package ch04;

public class Char_Tower {

	public static void main(String[] args) {
		int i,j;
		char a = 65;//65�� �ƽ�Ű�ڵ�� 'A'�̴�
		for (i =1 ; i <5; i++) {
			for ( j = 1; j <=i; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
		
	}

}
