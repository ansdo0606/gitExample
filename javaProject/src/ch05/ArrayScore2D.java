package ch05;

public class ArrayScore2D {

	public static void main(String[] args) {
		int[][] score = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t���");
		for (int i = 0; i < score.length; i++) {
			int sum = 0; //���� �ۿ��� �ؾ������� �ȿ��� �ص� �Ǳ� ��
			float avg =0.0f; //���
			String grade ="";
			
			System.out.printf("%d\t" , i+1 );//��ȣ���
			for (int j = 0; j < score[i].length; j++) {  //������ �迭�� ���
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
				
			}
			avg =sum/(float)score[i].length; //��հ��
			//����,��� ���
			
			if (avg >90 ) {
				grade ="A";
			}else if (avg > 80) {
				grade = "B";
			}else if (avg > 70) {
				grade = "C";
			}else if (avg > 60) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.printf("%d\t%.1f\t%s%n", sum,avg,grade);
		}
	}

}
