package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//�̺�Ʈ ó���� �ܺ� ���Ͽ��� ����
public class EventEx2 extends JFrame{
	private JButton button1,button2,button3,button4,button5,button6;
	public EventEx2() {
		//�÷ο� ���̾ƿ����� ����
		setLayout(new FlowLayout());
		button1 = new JButton("Red");//��ư ����
		button2 = new JButton("Green");//��ư ����
		button3 = new JButton("Blue");//��ư ����
		button4 = new JButton("White");//��ư ����
		button5 = new JButton("Yellow");//��ư ����
		button6 = new JButton("Cyan");//��ư ����

		//�����ӿ� ��ư�� ����
		add(button1);add(button2);add(button3);
		add(button4);add(button5);add(button6);
		
		//��ư�� ������ MyColorAction���� ������ actionPerFormed()�� �ڵ� ȣ��ȴ�.
		//��ư�� �̺�Ʈ ��� �߰�
		button1.addActionListener(new MyColorAction(this, Color.red));//�̺�Ʈ ��鷯��
		//�ܺ�Ŭ������ ���� �� ȣ���� ���ؼ� ����
		//this�� EventEx2 �ڽ��� ��ü�� ����Ű�� ��.���� ������ Ÿ�����δ� JFrame�� �ȴ�.(JFrame�� ��ӹ޾ұ� ����)
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//���� â�� ����
		
		
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}
