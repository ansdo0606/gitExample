package ch09;

public class Circle {
	//����޼ҵ�
	private void secret() {// private�� ����� �ȵȴ�
		System.out.println("����̴�.");
	}
	protected void findRadius() {
		System.out.println("������ ���ϱ�");
	}
	public void findArea() {
		System.out.println("���� ���ϱ�");
	}
	public Circle() {//�⺻�����ڵ� ���� �Ⱦ��� �ڵ����ִ°� ����
		
	}
	public Circle(int r) {//�����ڴ� ����� ����� �ƴϴ�.
		System.out.println("������ : "+r);
	}
}
