package ch16;

//Single Thread : �۾������� 1�� (main �����常 ����)
public class SingleThread {
	void print() {
		//���� �������� ������(currentThread)�� �̸�
		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {//���� �޼ҵ嵵  �����忴��(�̱� ������)
		SingleThread t = new SingleThread();
		t.print();
		t.print();
	}
}
