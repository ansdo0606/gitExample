package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame{
	//�������
	JPanel jp;//JPanel ���� ����
	JButton jb1,jb2,jb3,jb4,jb5,jb6;//��ư ���� ����
	
	public FlowLayoutEx2() {
		super("FlowLayout ����2");
		jp = new JPanel();//�гλ���
		jb1 = new JButton("��ư 1");//��ư ����
		jb2 = new JButton("��ư 2");//��ư ����
		jb3 = new JButton("��ư 3");//��ư ����
		jb4 = new JButton("��ư 4");//��ư ����
		jb5 = new JButton("��ư 5");//��ư ����
		jb6 = new JButton("��ư 6");//��ư ����
		jp.add(jb1);//�гο� ��ư �߰�
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		//�г��� FlowLayout���� ����
		//jp.setLayout(new FlowLayout());//�г��� �⺻ ���̾ƿ��� FlowLayout�̱⵵ �ؼ� ��������
		
		add(jp,"South");//JFrame�� "South"������ �г��� ��ġ
		add(jb5);
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
