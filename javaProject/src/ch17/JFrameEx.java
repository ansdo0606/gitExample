package ch17;


import javax.swing.JFrame;

public class JFrameEx extends JFrame{
//main �޼ҵ忡�� GUI �ڵ带 �ۼ��ص� ������ ������ 
//Frame extends�޾� �⺻ �����ڿ��� GUI �ڵ� ó���ϴ°��� �����Ѵ�.
	public JFrameEx() {
		super("JFrame ����");//����ó�� , �θ� ������ ȣ��
		setSize(400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JFrameEx();// ��ü���� �� �⺻������ ȣ��
	}
}
