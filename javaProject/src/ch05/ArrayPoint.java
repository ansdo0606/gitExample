package ch05;

public class ArrayPoint {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿","�̸���","������","������","�̼���"};
		int[] kor = {100,80,70,60,90};
		int[] eng = {80,90,95,85,75};
		int[] mat = {99,89,79,69,77};
		int[] tot = {0,0,0,0,0};
		double[] avg=new double[5];
		double tot_avg=0;
		for (int i = 0; i <5; i++) {
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i] =tot[i]/3.0;
			tot_avg = tot_avg+avg[i]; //��ü�л��� ���� ���ó��
		}
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i <5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"
					+tot[i]+"\t"+String.format("%4.1f",avg[i]));
		}
		System.out.println("�б���� : "+String.format("%5.1f", tot_avg/5));
	}

}
