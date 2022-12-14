package ch16;

//���� ������� ���� ���н�(������) �ü������ ��׶���� �����ϴ� ���α׷��� ���Ѵ�.
//���� ������� �����忡 �������� �ؼ� ����.�����쿡�� ���񽺶�� �Ѵ�.
//���󽺷���� �Ϲݽ����尡 ��� ����Ǹ� ���������� ����Ǵ� Ư¡�� ������.
public class DemonThread implements Runnable{
	@Override
	public void run() {
		while (true) {//���ѹݺ�
			System.out.println("���� �����尡 �������Դϴ�.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;//Exception�߻��� while�� ������������
			}
		}
	}//run()
	public static void main(String[] args) {
		Thread th = new Thread(new DemonThread());
		th.setDaemon(true);//���󽺷���� ����
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����尡 ����˴ϴ�.");
 }
}
