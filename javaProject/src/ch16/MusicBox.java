package ch16;

public class MusicBox {
//���� ����
//�޼ҵ��̸� �տ� synchronized�� ���̸� �ش� �޼ҵ�� ��ü ������ ��´�.
//synchronized�� ������ ���� �޼ҵ�� �ٸ� ��������� ����͸� ���� ȹ���߾, �װͰ� ������� ����ȴ�
	public synchronized void playMusicA() {
		for (int i= 0; i <= 10; i++) {//1�� ���Ϸ� ���鼭 10�� �ݺ�
			System.out.println("���� ����!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	
	//�˼� ����
	public synchronized void playMusicB() {
		for (int i= 0; i <= 10; i++) {
			System.out.println("�˼� ����!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicA()
	
	
	public  void playMusicC() {
		for (int i= 0; i <= 10; i++) {
			synchronized (this) {//this�� MusicBox��ü �ڽ��� ����Ŵ
				System.out.println("Ŭ���� ����!!!");
			}//��ü�޼ҵ忡 ���� ���ϰ� Ư���κи� synchronized��ó�� �Ҽ� �ִ�.
			
			//System.out.println("Ŭ���� ����!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}//playMusicC()
}
