package ch04;

public class For_Sum {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total=total+i;
			if (i%10 == 0) {
				System.out.println("1���� " + i + "������ �ڿ��� �հ�� "+ total);
			}//if 
		}//for
	}

}
