package ch16;

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread2 r1 = new MyThread2("*");
		MyThread2 r2 = new MyThread2("-");
	
		//MyThread2�� ���� Thread�� ��ӹ��� �ʾұ� ������ Thread�� �ƴϴ�.
		//���� ������ �����带 �����ϰ�,�ش� �����ڿ� MyThread2�� �־ Thread�� �����Ѵ�.
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
	
		t1.start();
		t2.start();
		
		System.out.println("!!!!!");//���ν������� ������ ���� ���
	}
}
