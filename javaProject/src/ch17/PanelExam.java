package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	public PanelExam() {//�⺻�����ڿ��� GUI�ڵ带 �ۼ��� ����
		//�гο��� 2�� �̻��� ������Ʈ�� ��ġ�� �� �ֱ� ������, ��ư�� �гο� �߰� ��
		//�г��� �����ӿ� �ٿ� ���� ���� ������Ʈ�� ó���� �� �ִ�.
		JPanel p=new JPanel(); //�г� ����
		p.setBackground(Color.red);//�г��� ������ ����
		//��ư ����(Swing�� �ѱ�ó���� �ߵȴ�.)
		JButton button1=new JButton("��ư1");
		JButton button2=new JButton("��ư2");
		JButton button3=new JButton("��ư3");
		JButton button4=new JButton("��ư4");
		JButton button5=new JButton("��ư5");
		JButton button6=new JButton("��ư6");
		
		//�гο� ��ư�� �߰�
		p.add(button1);
		p.add(button6);
		
		//�������̾ƿ��� ��ư �� �г��� �߰�
		add(p, BorderLayout.NORTH);

		add(button2);//�������̾ƿ��� ��ġ�� �����ϸ� Center�� ��ġ
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);//ȭ������� ����
		setVisible(true);//�������� ȭ�鿡 ǥ��
		
		//������ �ݱ� ��ư�� ������ �� (���α׷� ���� ����)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PanelExam();
	}

}
