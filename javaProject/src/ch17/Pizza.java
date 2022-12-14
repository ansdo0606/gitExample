package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame{
	public Pizza() {
		super("���� �޴�");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setBackground(Color.BLUE);
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.GREEN);
		
		JLabel label = new JLabel("���� ������ �����ϼ���");
		panel1.add(label);
		
		JButton button1= new JButton("ġ��");
		JButton button2= new JButton("�Ұ��");
		JButton button3= new JButton("��������");
		JButton button4= new JButton("����");
		
		//�г� 2�� ��ư �߰�
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		//�гο� �ٸ� �г� ����
		panel.add(panel1);
		panel.add(panel2);
		
		//�г��� �����ӿ� ����
		add(panel,"North");
		setVisible(true);
		
		//�̺�Ʈ ó��
		ActionListener handler = new ActionListener() {//�͸�Ŭ����
			
			//���â�� Dialog( ���,�ȳ�â��)���� �̺�Ʈ�� ���� ���
			//���â�̶� ��â(�θ�) �տ� Ƣ��� ������ â(�ڽ�)���� �θ�-�ڽİ��踦 ���� ������ ����̴�.
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("ġ��")) {
					JOptionPane.showMessageDialog(null, "ġ�����ڸ� �����ϼ̽��ϴ�."+
				"\n���� :23,000��","ġ������",JOptionPane.INFORMATION_MESSAGE);
				}else if (e.getActionCommand().equals("�Ұ��")) {
					JOptionPane.showMessageDialog(null, "�Ұ�����ڸ� �����ϼ̽��ϴ�."+
				"\n���� :25,000��","�Ұ������",JOptionPane.WARNING_MESSAGE);
				}else if (e.getActionCommand().equals("��������")) {
					JOptionPane.showMessageDialog(null, "�����������ڸ� �����ϼ̽��ϴ�."+
				"\n���� :20,000��","������������",JOptionPane.DEFAULT_OPTION);
				}else if (e.getActionCommand().equals("����")) {
					JOptionPane.showMessageDialog(null, "���α׷��� ���� �����Ͻðڽ��ϱ�?",
				"����",JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};
		//��ư�� �����ʸ� �����ؼ� �̺�Ʈ ��鷯(actionPerformed)�� ȣ���ؼ� ó���ϰ� ��
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
	}
	public static void main(String[] args) {
		new Pizza();
	}
}
