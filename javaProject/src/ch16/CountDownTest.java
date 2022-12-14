package ch16;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame{
	private JLabel label;
	class MyThread extends Thread{//��øŬ����
		@Override
		public void run() {
			for (int i = 10; i >= 0; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}
			System.exit(0);//�ڵ�����
		}
	}//end ��øŬ����
	public CountDownTest() {
		setTitle("ī��Ʈ�ٿ�");
		setSize(300,200);//������ ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������ �ݱ� ó��
		
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new MyThread()).start();//(new ������) start()
		setVisible(true);//ȭ���� ���̰� �⺻����
				
	}
	
	public static void main(String[] args) {
		//
		new CountDownTest();//���������� �� ���� ������ ��ó�� �����ڸ� ȣ���ؼ� ��ü�����ص� �ȴ�.
	}
}
