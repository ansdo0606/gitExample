package ch06;


public class VoidExam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		hello();
		System.out.println("���α׷� ��");
	}

	private static void hello() { //void�� ���ϰ��� ������ �ǹ�
		System.out.println("�ȳ��ϼ���?");
		return; //��������� �޼ҵ带 �����Ѵ� ��� �ǹ�, ��������
	}

}
