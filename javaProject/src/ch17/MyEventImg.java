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

public class MyEventImg extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y;
	private int width,heigth;
	private Image img;
	private boolean flag=false;
	
	@Override
	public void init() {
		setSize(1200, 1200);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("cat.png"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		setFocusable(true);
		requestFocus();
	
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width=img.getWidth(null);
		heigth=img.getHeight(null);
		System.out.println(width+" , "+heigth);
		
		if (flag) {
			g.drawImage(img, x, y, this);
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y=Math.max(0, y-5);		break;
		case KeyEvent.VK_DOWN:
			y=Math.min(1200-heigth, y+5); break;
		case KeyEvent.VK_LEFT:
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x=Math.min(1200-width, x+5); break;

		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x :"+x+" ,y:"+y);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move : x :"+x+" ,y:"+y);
		repaint();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;
		x=e.getX();
		y=e.getY();
		repaint();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
