package ch06;

public class ReturnEx {
	//���ϰ��� �ִ� �޼ҵ�
	public static int sum(int a) { //����ڰ� ������ �Լ� , a=50
		int result = 0;
		for (int i = 1; i <= a; i++) {
			result = result + i;
		}
		return result; //�޼ҵ带 ȣ���� ������ ���� ��ȯ��
	}
	public static void main(String[] args) {
		int n = sum(50); //sum�޼ҵ� ȣ���� �� ���Ϲ��� ���� n������ ����
		System.out.println(n);
		n = sum(100); //�޼ҵ� ����
		System.out.println(n);
	}

}
