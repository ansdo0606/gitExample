package ch09;

public class Ball extends Circle {
	private String color;//ballŬ������ ���
	public Ball(String color) {//�Ű������� �ִ� ������
		this.color = color;
	}
	
	public void findColor() {
		System.out.println(color+"���̴�.");
	}
	public void findVolume() {//BallŬ������ ���
		System.out.println("���Ǳ��ϱ�");
	}
	
	
}
