package ch12;

import java.awt.Frame;//GUI���� Ŭ����
//Frame : ������â�� ����ִ� Ŭ����
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//������Ŭ������ �ַ� ����ϴ� ���α׷��� GUI ���α׷�
public class InnerExam extends Frame{
	public InnerExam() {//�⺻������
		super("���� Ŭ���� �׽�Ʈ");//�θ������ ȣ�� �� ����ó��
		setSize(600,800);//�������� �⺻ ����,���� �ʱ������ ����
		setVisible(true);//�������� ȭ�鿡 ǥ��
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		e.addWindowListener(new WindowListener() {//���� ���� Ŭ����
			
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
			//������â�� ������ �ڵ�ȣ��([x] ��ư�� ������)
			@Override
			public void windowClosing(WindowEvent e) {//�̺�Ʈ �ڵ鷯
				System.exit(0);//���α׷� ����
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});//end ���� ���� Ŭ����
	}
}
