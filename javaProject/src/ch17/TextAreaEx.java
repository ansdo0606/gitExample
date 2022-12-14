package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	//�������
	private JTextField tf = new JTextField(20);//���� �Է�â ����
	private JTextArea ta = new JTextArea(6,20);//6��20���� �Է�â�� ����
	
	public TextAreaEx() {
		super("TextArea ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("�Է� �� <Enter> Ű�� �Է��ϼ���."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");//�ؽ�Ʈ�ʵ��� ���ڿ��� textarea�������� �ű�
				t.setText("");//���� �ؽ�Ʈ �ʵ忡 �Էµ� ���� �����
				
			}
		});
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
