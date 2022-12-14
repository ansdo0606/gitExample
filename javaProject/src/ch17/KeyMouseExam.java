package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

//MouseListener :���콺 �̺�Ʈ ó���� ���� �������̽�
//MouseMotionListener : ���콺 �̵��̺�Ʈ ó���� ���� �������̽�
//KeyListener : Ű���� �̺�Ʈ�� ���� �������̽�

public class KeyMouseExam extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y;//�̹��� ����� x,y��
	private int width,heigth;// ���μ��� ������
	private Image img;//�̹��� ó�� ��ü
	private boolean flag=false;//�̹����� ó�� �����Ҷ� �Ⱥ��̰� ó���ϱ� ����
	
	@Override
	public void init() {
		setSize(500, 500);
		//�̹����� �ҷ����� �ڵ�
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//���� Ŭ������ ���콺 �̺�Ʈ ��� �߰�(�߿��ڵ�)
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		//Ű�Է��� ������ �ֵ��� ����
		setFocusable(true);
		//���� ȭ�鿡 Ű �Է� ��ö
		requestFocus();
		
	}

	@Override
	public void paint(Graphics g) {//ȭ�� ��� �뵵
		super.paint(g);
		//�̹����� ���μ��� ���� ���
		width=img.getWidth(null);
		heigth=img.getHeight(null);
		System.out.println(width+" , "+heigth);
		
		//drawImage(�̹���, x, y, �̹��� ������);
		if (flag) {//���콺�� Ŭ���� �ϸ� true�� �ȴ�.
			g.drawImage(img, x, y, this);
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// Ű�� �Է��ϸ� ȣ��
		
	}
	//Ű�� ������ ������ ȣ��
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//Ű �ڵ尪
		System.out.println(e.getKeyChar());//Ű ���ڰ�

		//max(��,��) �Ǵ� min()�� �տ� ���� ���� ���� �ִ밪,�ּҰ�
		//�̹����� ������ ������ ���������� �ʰ� �Ϸ��� ����
		switch (e.getKeyCode()) {//Ű �ڵ尪�� ���� �н�
		case KeyEvent.VK_UP://���� Ű�� ������ 
			y=Math.max(0, y-5);		break;
		case KeyEvent.VK_DOWN://�Ʒ��� Ű�� ������
			y=Math.min(500-heigth, y+5); break;
		case KeyEvent.VK_LEFT://����Ű ������
			x=Math.max(0, x-5);
		case KeyEvent.VK_RIGHT://������ Ű�� ������
			x=Math.min(500-width, x+5); break;

		}
		repaint();//�׷��� ���� ��û
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//������Ʈ �󿡼� mouse��ư�� ���� ���¿��� �巡�������� ȣ��
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x :"+x+" ,y:"+y);
		
	}
	//���콺 Ŀ���� ������Ʈ �󿡼� �̵������� ��ư�� �۵����� ���� ��쿡 ȣ��
	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move : x :"+x+" ,y:"+y);
		repaint();
	}
	//������Ʈ�󿡼� ���콺 ��ư�� Ŭ��(�����ٰ� ������)������ ȣ���� �ȴ�.
	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;//Ŭ���Ҷ� trueó��(�̹����� ���̰���)
		//���콺 Ŭ���� ��ǥ�� ����
		x=e.getX();//x��ǥ�� ����
		y=e.getY();//y��ǥ�� ����
		//�׷��� ���� ��ö => paint()�� �ڵ� ȣ��
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//������Ʈ�󿡼� ���콺��ư�� ���� �� ȣ��
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//���콺 ��ư�� ������ ������ ȣ���
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//���콺�� ���۳�Ʈ�� ������ ȣ��
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// ���콺�� ���۳�Ʈ�� �����ϸ� ȣ��
		
	}

}
