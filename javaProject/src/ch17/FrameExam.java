package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//AWT : java + c ����( ���� �������� �߼�)
//Swing : AWT�� ����Ų ����,java�θ� ����
public class FrameExam {
	public static void main(String[] args) {
		Frame f = new Frame("������ �׽�Ʈ");//Frame����(������â)
		f.setSize(300, 400);//������ ������ ����
		f.setVisible(true);//false�ϸ� ������°� �ȴ�.
		/*f.addWindowListener(new WindowListener() {//�͸�Ŭ������ �̺�Ʈ ��鷯
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				//���α׷� ����ó��, �������� : 0. ������ ���� : -1
				System.exit(0);
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});//�͸�Ŭ����
		*/
		
		//Adapter�� ����ϸ� �ڵ尡 ����������.
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
