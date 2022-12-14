package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyEventColor implements ActionListener{

	private JFrame f;
	private Color c;
	private Container con;
	
	
	public MyEventColor(JFrame f,Color c) {
		this.f =f;
		con = f.getContentPane();//프레임의 컨텐츠 영역
		this.c = c;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
		
	}
	
}
