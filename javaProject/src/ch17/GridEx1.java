package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx1 extends JFrame{
	public GridEx1() {
		super("GrodLayout ����");
		setLayout(new GridLayout(2, 3));//2�� 3���� �׸��巹�̾ƿ� ����
		JButton btn1 = new JButton("��ư 1");
		JButton btn2 = new JButton("��ư 2");
		JButton btn3 = new JButton("��ư 3");
		JButton btn4 = new JButton("��ư 4");
		JButton btn5 = new JButton("��ư 5");
		JButton btn6 = new JButton("��ư 6");
		
		//�׸��� ���̾ƿ����� ��ư�� �߰�
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridEx1();
	}
}
