package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		super("�ؽ�Ʈ�ʵ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(20));//�ʵ�ũ�� 20
		c.add(new JLabel("�а�"));
		c.add(new JTextField("��ǻ�Ͱ��а�",20));
		c.add(new JLabel("�ּ�"));
		c.add(new JTextField("����� ������",20));
		c.add(new JLabel("���"));
		c.add(new JPasswordField(20));
		
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}