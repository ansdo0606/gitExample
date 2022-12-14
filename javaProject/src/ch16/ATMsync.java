package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm,"mom");
		Thread son = new Thread(atm,"son");
		mom.start();
		son.start();
	}
}

class ATM implements Runnable{
	
	private long accBalance=10000;//�����ܰ�
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				notify();//wait�ϰ� �ִ� �����带 ����
				try {
					wait();//���� ���� �����带 �Ͻ��������·� ����鼭 �ٸ� ������ ����ǵ��� ���
					Thread.sleep(1000);//����ӵ� ����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (getAccount() <= 0 ) {//�����ܾ��� ������
					break;//for���� ��������
					
				}
				withDraw(1000);//1000�� 
			}//for
		}
	}//run()
	
	public long getAccount() {
		return accBalance;
	}
	public void withDraw(long cash) {//��ݰ��� �޼ҵ�
		if (getAccount() >0) {
			accBalance -= cash;//�ܾ׿��� 1000���� ����
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.printf("�ܾ� : %,d �� %n",getAccount());//%,d�� 3�ڸ��� �ĸ�ó��
		}else {
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}
