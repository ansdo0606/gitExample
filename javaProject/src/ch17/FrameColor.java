package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame{
	
	public FrameColor() throws InterruptedException{
		setVisible(true);//화면을 표시
		//프레임의 컨텐츠 영역처리 코드
		Container c = getContentPane();
		for (int i = 0; i < 255; i++) {
			setSize(i*2, i);
			setLocation(i*2,i);
			c.setBackground(new Color(i,0,0));//배경색상 설정
			Thread.sleep(10);//잠시 멈춤
		}
		for (int i = 0; i < 255; i++) {
			setSize(i*2, i);
			setLocation(i*2,i);
			c.setBackground(new Color(255,i,0));//배경색상 설정
			Thread.sleep(10);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창을 닫으면 프로그램도 종료
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();
	}
}
