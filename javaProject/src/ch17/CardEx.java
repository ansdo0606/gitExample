package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame{
	CardLayout card;
	Container con;
	public CardEx() {
		super("CardLayout ����");
		card = new CardLayout();//ī�巹�̾ƿ� ����
		con = getContentPane();//�������� ������ ������ ����� ó��
		setLayout(card);//�⺻���̾ƿ��� ī�巹�̾ƿ����� ����
		JPanel[] pan = new JPanel[5];//�г� �迭 5�� ����
		Color[] color = {Color.red,Color.yellow,Color.green,Color.blue,Color.cyan};//���� �迭
		for (int i = 0; i < pan.length; i++) {
			pan[i]=new JPanel();//�гλ���
			pan[i].setBackground(color[i]);//�г��� ������ ����
			add("card"+i,pan[i]);//add("�̸�",������Ʈ)
			//�гο� ���콺 �̺�Ʈ �߰�
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(con);//����ȭ������ �̵�
				}
			});
			setSize(500, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		new CardEx();
		
	}
}
