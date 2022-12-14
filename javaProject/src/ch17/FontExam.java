package ch17;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font;
	private FontMetrics fm;//�۲ð��� ������ �����ϴ� Ŭ����
	private int x,y;
	private String messege;
	private Dimension dim;//Ư�� ������ �簢���� ���� ���̰��� �����Ҽ� �ֵ��� �����ִ� �޼ҵ�

	@Override
	public void init() {
		messege = "�׷��� �׽�Ʈ";
		// new Font(��Ʈ, �ɼ�, ������)
		font = new Font("����", Font.ITALIC, 30);
		fm=getFontMetrics(font);//��Ʈ�� ����,���� ����� ������
		setSize(500, 500);//���ø� ������ ����
		//���ڰ� ȭ��ũ�⿡ �°� �߾ӿ� ��ġ�ϰ��� �ϴ� ó��
		dim = getSize();//ȭ��ũ�� ����ؼ�  Dimension�� ����
		System.out.println(dim.width);//����ȭ���� ���λ�����
		System.out.println(dim.height);//����ȭ���� ���λ�����
		
		x=(dim.width/2)-(fm.stringWidth(messege)/2);//��Ʈ�� ���α��̰� ó����
		y=(dim.height/2)-(fm.getDescent()/2);//��Ʈ�� ���α��̰� ó����
		
		
	
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);//��Ʈ����
		//���ڿ� ���
		g.drawString(messege, x, y);
	
	}
}
