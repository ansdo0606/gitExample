package ch15;


public class ThrowsExam {
//����ó�����
//1)try~catch ����ó��
//2)throws ����ó���� Ŭ������ ����
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt(cpu ����)
		}
	}
}
