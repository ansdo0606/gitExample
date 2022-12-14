package ch17;


import javax.swing.JFrame;

public class JFrameEx extends JFrame{
//main 메소드에서 GUI 코드를 작성해도 되지만 가급적 
//Frame extends받아 기본 생성자에서 GUI 코드 처리하는것을 권장한다.
	public JFrameEx() {
		super("JFrame 예제");//제목처리 , 부모 생성자 호출
		setSize(400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JFrameEx();// 객체생성 겸 기본생성자 호출
	}
}
