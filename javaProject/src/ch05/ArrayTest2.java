package ch05;

public class ArrayTest2 {

	public static void main(String[] args) {
		int sum =0; //�����뵵
		float avg = 0f; //��տ뵵
		int [] score = {100,80,100,100,90};
		for (int i = 0; i < score.length; i++) {
			sum += score[i]; //sum = sum+score[i]
		}
		avg = sum / (float)score.length; //�Ի����� float�� ������� ����ȯ
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		
	}

}
