package ch05;

public class ArraySum {

	public static void main(String[] args) {
		/*int[] num = {10,20,30,40,50};
		int sum=0; //�迭�� �հ踦 ������ ����*/
		int[] num; 
		num= new int[5]; 
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		int sum = 0;
		for (int i = 0; i <5; i++) {
			sum = sum + num[i];
			/*for (int i = 0; i <num.length; i++) {
				sum = sum + num[i]; ��������.length�� �迭�� �������� �����´�. */
			
		}
		System.out.println("�հ� : " +sum);
	}

}
