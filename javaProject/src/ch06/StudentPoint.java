package ch06;


public class StudentPoint {

	static String[] name = {"ȫ�浿","���Ӵ�","�̼���"};
	static int[] number = {1001,1002,1003};
	static int[] java = {90,95,84};
	static int[] db = {85,79,92};
	static int[] html = {99,88,95};
	static int[] jsp = {76,92,72};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0,0.0,0.0};
	
	//�������뵵
	static void getTot() {
		for (int i = 0; i < 3; i++) {
			tot[i] = java[i] + db[i] +html[i]+jsp[i];
			
		}
	}
	//��� ���
	static void getAvg() {
		for (int i = 0; i < 3; i++) {
			avg[i] = tot[i]/4.0;
		}
	}
	
	//��¿뵵
	static void print() {
		System.out.println("�й�\t�̸�\tJava\tDB\tHTML\tJSP\t����\t���");
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(number[i]+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]+
					"\t"+jsp[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("��ü �л��� : 3��");
		System.out.println("--------------------------------------------------------------------------");
		getTot(); //�������
		getAvg(); //��հ��
		print();  // ���
		System.out.println("--------------------------------------------------------------------------");
	}
}
