package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i % 5 ==0) {//5�� ����� ������
				continue;//���� �ڵ带 ����(skip), ���� �ܰ��
			}
			System.out.println(i);
		}
	}

}
