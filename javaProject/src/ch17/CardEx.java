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
		super("CardLayout 예제");
		card = new CardLayout();//카드레이아웃 생성
		con = getContentPane();//프레임의 컨텐츠 영역을 만들어 처리
		setLayout(card);//기본레이아웃을 카드레이아웃으로 변경
		JPanel[] pan = new JPanel[5];//패널 배열 5개 생성
		Color[] color = {Color.red,Color.yellow,Color.green,Color.blue,Color.cyan};//색상 배열
		for (int i = 0; i < pan.length; i++) {
			pan[i]=new JPanel();//패널생성
			pan[i].setBackground(color[i]);//패널의 배경색상 설정
			add("card"+i,pan[i]);//add("이름",컴포넌트)
			//패널에 마우스 이벤트 추가
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(con);//다음화면으로 이동
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
