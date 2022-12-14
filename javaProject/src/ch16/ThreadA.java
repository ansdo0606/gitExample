package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();//run ȣ��
		
		synchronized (b) {//ThreadB��ü�� ���� ����ȭ ����
			System.out.println("b�� �Ϸ�ɶ����� ��ٸ��ϴ�.");
			try {
				b.wait();//main �����尡 ThreadB���� �ڽ���  wait(�Ͻ�����) �ϰڴٰ� ����
			//��, wait()�� ����͸� ���� Ǯ��, �ٸ� �����忡�� notify(All)�� ȣ�����ֱ⸦ ��ٸ���.
				//notify�� �����ϸ� �Ͻ����� ���¿��� Ǯ���� ������ �̾� ������.
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
	}
}

class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"�� ���մϴ�.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}//for
			notify();
		}
	}
	
}
