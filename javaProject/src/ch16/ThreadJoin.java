package ch16;

public class ThreadJoin extends Thread{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"�����尡 ���۵Ǿ����ϴ�.");
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");//������ �̸� 
		e.start();
		//join : join method�� ȣ���� �����尡 ����ɶ����� ������ �����带 ����Ŵ
		//���ο� �����尡 �����ǰ� start()�� ȣ���ϸ� ���ο� �۾������� ��������� run()�޼ҵ尡 ����
		try {
			e.join();//���ο� �۾��� ��û�ϸ� ��ٷȴٰ� �ٽ� ����- ��ġ �̱۽�����ó�� ����
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"�����尡 ����Ǿ����ϴ�.");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"�����尡 ���۵Ǿ����ϴ�.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"�����尡 ����Ǿ����ϴ�.");
	}
}
