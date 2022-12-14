package ch16;

//��Ƽ������ : �۾������� 2�� �̻�
//��Ƽ�����带 �����ϴ� ���
//1) Thread�� ���
//2) Runnable�� ����

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name);//�θ������ ȣ��, Ÿ��Ʋ ó��
	}
	
	//������ ���� �޼ҵ�
	@Override
	public void run() {//�ݵ�� �������̵� ��
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());//���� �������� ������ �̸� ���
		}
		try {
			Thread.sleep(1000);//cup�� ������ 1�ʰ� ���� (�ʼ�����ó��)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThreadExam e1=new ThreadExam("thread1");
		ThreadExam e2=new ThreadExam("thread2");
		ThreadExam e3=new ThreadExam("thread3");
		
		e1.start();//������.start() ==> run()�� �ڵ� ȣ���
		e2.start();//���� ���ÿ� ȣ��
		e3.start();//���� ���ÿ� ȣ��, ��, ���⼱ 3���� ���ÿ� run()ȣ����.
		//e1.run();//run()�� ȣ���ϸ� ���� �����尡 ����Ǳ� ������ �����ؾ� �Ѵ�.
		//��������� �׶��׶����� �ٸ���(JVM�� ���Ƿ� �켱������ �����ش�.)
	}
}
