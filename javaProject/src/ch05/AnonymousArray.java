package ch05;

import ch04.Sum;

//����迭 : �迭�� �̸��� �������� �ʰ� �ܼ��� �ʱⰪ������ �迭�� ����
//����迭�� ��� �迭�� ����� �Լ��� �μ��� �����Ҷ� ���� �迭�� �� �ѹ��� �ʿ��ϰ� 
// �ٽô� ���������� ������ ����Ҽ� ����.
public class AnonymousArray {

	public static void main(String[] args) {
		System.out.println("���ڵ��� �� : "+ sum(new int[] {1,2,3,4}));
	}
	
public static int sum(int[] numbers) { //numbers[0]=1,numbers[1]=2,numbers[2]=3,numbers[3]=4
	int total=0;
	for (int i = 0; i < numbers.length; i++) {
		total = total+numbers[i]; //1+2+3+4
	}
	return total;
}
}
