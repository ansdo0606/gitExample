package ch06;

public class PointEx {
	//�������
	static String[] name = {"ȫ�浿","�̸���","�̼���","���θ�","������"};
	static int[] kor = {80,90,100,60,70};
	static int[] eng = {90,99,77,66,88};
	static int[] mat = {89,60,80,90,100};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0.0,0.0,0.0,0.0,0.0};
	
	//�������뵵
	static void getTot() {
		for (int i = 0; i < 5; i++) {
			tot[i] = kor[i] + eng[i] +mat[i];
			
		}
	}
	//��� ���
	static void getAvg() {
		for (int i = 0; i < 5; i++) {
			avg[i] = tot[i]/3.0;
		}
	}
	
	//��¿뵵
	static void print() {
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+
					"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		getTot(); //�������
		getAvg(); //��հ��
		print();  // ���
	}

}
