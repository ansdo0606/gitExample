package ch16;

public class MyBank {
	public synchronized void bankUserA() {
		for (int i= 1; i <= 5; i++) {//1�� ���Ϸ� ���鼭 10�� �ݺ�
			System.out.println("ȫ�浿���� �����ܰ�� "+(i*10)+"�����Դϴ�.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void bankUserB() {
		for (int i= 2; i <= 6; i++) {//1�� ���Ϸ� ���鼭 10�� �ݺ�
			System.out.println("���Ӵ���� �����ܰ�� "+(i*10)+"�����Դϴ�.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void bankUserC() {
		for (int i= 3; i <= 7; i++) {//1�� ���Ϸ� ���鼭 10�� �ݺ�
			System.out.println("�̸������ �����ܰ�� "+(i*10)+"�����Դϴ�.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
}
