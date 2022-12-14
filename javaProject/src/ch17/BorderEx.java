package ch17;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class BorderEx extends JFrame{
	
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(500, 400);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		//보더레이아웃은  프레임의 기본 레이아웃이기 때문에 생략해도 된다.
		//setLayout(new BorderLayout());
		
		//컴포넌트를 보더레이아웃의 각 영역에 배치
		add(b1,"East");//East영역에 배치
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		add(b5,"Center");//또는 add(b5)
		
		//윈도우 창닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		
	}
}
