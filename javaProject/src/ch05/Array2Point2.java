package ch05;

public class Array2Point2 {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		for (int i = 0; i < score.length; i++) {
			int sum = 0; //���� �ۿ��� �ؾ������� �ȿ��� �ص� �Ǳ� ��
			float avg =0.0f; //���
			
			System.out.printf("%d\t" , i+1 );//��ȣ���
			for (int j = 0; j < score[i].length; j++) { //������ �迭�� ���
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
				
			}
			avg =sum/(float)score[i].length; //��հ��
			//����,��� ���
			System.out.printf("%d\t%.1f%n", sum,avg);
		}
	}

}
