package ch04;

public class WhileEx2 {

	public static void main(String[] args) {
		int i = 1;//�ʱ��
		int num = 10;
		int sum = 0;
		while(i<=num) {//���ǽ�
			sum=sum+i;//sum += i;
			i++;//������
		}
		System.out.println("1~"+num+"������ �հ� : "+sum);
	}

}
