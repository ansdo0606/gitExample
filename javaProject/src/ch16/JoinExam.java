package ch16;

public class JoinExam {
	public static void main(String[] args) {//���� ������� �켱���� ���� ����.
		MyThread3 thread = new MyThread3();
		thread.start();//������ ����
		System.out.println("Thread�� ����ɶ����� ��ٸ��ϴ�.");
		try {
			thread.join();//�ش� �����尡 ����ɶ����� ��ٸ���
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread�� ����Ǿ����ϴ�.");
	}
}
