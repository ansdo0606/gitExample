package ch17;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class BorderEx extends JFrame{
	
	public BorderEx() {
		setTitle("BorderLayout ����");
		setSize(500, 400);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		//�������̾ƿ���  �������� �⺻ ���̾ƿ��̱� ������ �����ص� �ȴ�.
		//setLayout(new BorderLayout());
		
		//������Ʈ�� �������̾ƿ��� �� ������ ��ġ
		add(b1,"East");//East������ ��ġ
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		add(b5,"Center");//�Ǵ� add(b5)
		
		//������ â�ݱ�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		
	}
}
