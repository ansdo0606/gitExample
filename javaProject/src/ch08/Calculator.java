package ch08;
//������ �ڵ� Ư¡
//�����ڰ� �����ڸ� ����� �Ϳ� ������ ���ϸ� �����Ϸ��� �ڵ����� �⺻ �����ڸ� ��������
//�Ű������� �ִ� �����ڸ� �� �ϳ��� ����ٸ� �����Ϸ��� ���̻� �⺻�����ڸ� ������ �ʴ´�.
public class Calculator {
	//�������
	private int left;
	private int right;
	//�⺻������
	public Calculator() {
		System.out.println("�⺻������ ȣ��...");
	}
	//�Ű������� �ִ� ������
	public Calculator(int left, int right) {
		System.out.println("�Ű������� �ִ� ������ ȣ��...");
		this.left = left;
		this.right = right;
	}
	//getter,setter
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}
