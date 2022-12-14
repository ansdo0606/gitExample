package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame{
	public FlowLayoutEx1() {
		setTitle("FlowLayout �⺻����");//������ ����
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//���� JFrame,Frame�� �⺻ ���̾ƿ��� BorderLayout�̴�.
		//FlowLayout���� ���̾ƿ��� �����Ű��
		setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		
		//setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		//��������,������Ʈ���� �¿찣�� 30�ȼ�,���ϰ����� 40�ȼ��� �ɼ��� ���Ҽ� �ִ�.
		
		//���̾ƿ��� ��ư ���� �� �߰�
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	public static void main(String[] args) {
		new FlowLayoutEx1();
	}
}
