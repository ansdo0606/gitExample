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

//MouseListener :마우스 이벤트 처리를 위한 인터페이스
//MouseMotionListener : 마우스 이동이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트를 위한 인터페이스

public class KeyMouseExam extends JApplet implements MouseListener,MouseMotionListener,KeyListener{
	private int x,y;//이미지 출력할 x,y값
	private int width,heigth;// 가로세로 사이즈
	private Image img;//이미지 처리 객체
	private boolean flag=false;//이미지가 처음 실행할땐 안보이게 처리하기 위해
	
	@Override
	public void init() {
		setSize(500, 500);
		//이미지를 불러오는 코드
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재 클래스에 마우스 이벤트 기능 추가(중요코드)
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		//키입력을 받을수 있도록 설정
		setFocusable(true);
		//현재 화면에 키 입력 요철
		requestFocus();
		
	}

	@Override
	public void paint(Graphics g) {//화면 출력 용도
		super.paint(g);
		//이미지의 가로세로 길이 계산
		width=img.getWidth(null);
		heigth=img.getHeight(null);
		System.out.println(width+" , "+heigth);
		
		//drawImage(이미지, x, y, 이미지 관찰자);
		if (flag) {//마우스를 클릭을 하면 true가 된다.
			g.drawImage(img, x, y, this);
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 입력하면 호출
		
	}
	//키가 눌려져 있을때 호출
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값

		//max(값,값) 또는 min()는 앞에 값과 뒤의 값중 최대값,최소값
		//이미지가 프레임 밖으로 빠져나가지 않게 하려고 설정
		switch (e.getKeyCode()) {//키 코드값에 따라 분시
		case KeyEvent.VK_UP://위쪽 키를 누르면 
			y=Math.max(0, y-5);		break;
		case KeyEvent.VK_DOWN://아래쪽 키를 누르면
			y=Math.min(500-heigth, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽키 누르면
			x=Math.max(0, x-5);
		case KeyEvent.VK_RIGHT://오른쪽 키를 누르면
			x=Math.min(500-width, x+5); break;

		}
		repaint();//그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//컴포넌트 상에서 mouse버튼을 누른 상태에서 드래그했을때 호출
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x :"+x+" ,y:"+y);
		
	}
	//마우스 커서가 컴포넌트 상에서 이동했지만 버튼이 작동되지 않은 경우에 호출
	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move : x :"+x+" ,y:"+y);
		repaint();
	}
	//컴포넌트상에서 마우스 버튼을 클릭(눌렀다가 놓을때)했을때 호출이 된다.
	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;//클릭할때 true처리(이미지가 보이게함)
		//마우스 클릭한 좌표를 저장
		x=e.getX();//x좌표값 저장
		y=e.getY();//y좌표값 저장
		//그래픽 갱신 요철 => paint()를 자동 호출
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴포넌트상에서 마우스버튼을 누를 때 호출
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스 버튼을 완전히 놓을때 호출됨
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴퍼넌트에 들어갔을때 호출
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴퍼넌트를 종료하면 호출
		
	}

}
