package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Shapes extends JApplet{
	
	@Override
	public void init() {//�ݵ�� �ʱ�ȭ
		setSize(500, 500);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 =(Graphics2D)g;
		
		//setColor()�� �Ⱦ��� �������� �⺻
		g2.setStroke(new BasicStroke(5));//�� ���� ����
		g.drawLine(10, 10, 200, 10);
		
		g.setColor(Color.yellow);
		g2.setStroke(new BasicStroke(1));
		g.drawRect(120, 40, 90, 50);
		
		g.setColor(Color.cyan);
		g.fillRect(120, 140, 90, 50);
		
		g.setColor(Color.red);
		//fillRoundRect(x, y, w, h, ���ζ������, ���ζ������);
		g.fillRoundRect(120, 240, 90, 50, 30, 30);
		
		g.setColor(Color.blue);
		g.drawOval(0, 40, 90, 55);//Ÿ���׸���
		
		g.setColor(Color.pink);
		g.fillOval(0, 140, 90, 55);
		
		int [] x = {10, 30, 50, 40, 20};
		int [] y = {257, 240, 257, 280, 280};
		//fillPolygon(x[], y[], ������ ����);
		g.fillPolygon(x, y, x.length);//�ٰ��� �׸���
	
	
	}
	
}
