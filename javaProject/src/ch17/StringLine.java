package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet : Applet�� Ȯ�������� 1995�⿡ ó�� �Ұ���.
//���ø��� ���������� �Բ� �������� ���� �� �پ��� �׷����� �����Ҽ� �ִ�.
//����� HTML5�� ���� ��ȭ�Ǹ鼭 ���� Ȱ����� �ʴ´�.
//������ ����Ŭ�� ������ �ִ�.init()-start()-stop()-destroy()
//init()�� �ʼ�ó���̸� �������� �ڵ����� ó���Ѵ�.

public class StringLine extends JApplet{
	@Override
	public void init() {//���ø��� �ʱ�ȭ�ϴ� �ڵ������������������
		getContentPane().setBackground(new Color(255,255,255));//������ ����
		setSize(500, 500);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//���׸���(x1,y1,x2,y2);
		g.drawLine(250, 50, 30, 160);
		
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50);
		
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		
		g.setColor(Color.blue);
		g.drawString("blue string", 10, 110);
		
		
	}
}
