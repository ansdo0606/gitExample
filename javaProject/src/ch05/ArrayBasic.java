package ch05;
//�迭
public class ArrayBasic {

	public static void main(String[] args) {
		/*int[] score = new int[5]; => ���ٷ� ó�� ����
		int[] score = {100,90,80,60,70}; �ǹ����*/
		
		int[] score; //�迭�������� ����
		score = new int[5]; //new�� ���ؼ� �޸𸮿� 5���� int��
		
		//�迭����(4byte x 5 = 20byte) ������ ������ �޸� Ŀ��
		System.out.println(score); //score�� �޸��� �ּҰ��� ����Ű�� ���������� �ȴ�.
		score[0]=100;
		score[1]=90;
		score[2]=80;
		score[3]=60;
		score[4]=70;
		//score[5]=90; ������ �¾ƾ� �ϸ� 0���� �������� �׻� ����ؾߵ�
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		//System.out.println(score[5]); ������ ��
		
		/*for (int i = 0; i < 5; i++) {
			System.out.println(score[i]); ���� �� �ٸ� ǥ�����*/
		}
	}


