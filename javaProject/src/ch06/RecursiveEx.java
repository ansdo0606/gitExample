package ch06;
//���ȣ�� - ���� �� ��� ����(�޸� ����)
//factorial ��� :5!=5x4x3x2x1
public class RecursiveEx {

	static long fact1(int n) {  //5
		return n == 1 ? 1 : n*fact1(n-1);  //������ Ÿ�԰� ������ �¾ƾ� ��
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));
	}
}
