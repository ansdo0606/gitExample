package ch06;

//�޼ҵ� ���
public class MethodEx2 {

	//���� �޼ҵ�(���α׷� �������� ��)
	//���θ޼ҵ�� �ش� �ڵ������� ��ġ�� ������� �� ���� ������
	public static void main(String[] args) {
		//���α׷� ����
		System.out.println("��(1~10) : " +sum(1,10));
		System.out.println("��(10~100) : " +sum(10,100));
		System.out.println("��(100~1000) : " +sum(100,1000));
		//���α׷� ��
	}
	//����� ���� �޼ҵ�
	public static int sum(int a, int b) { //a=100,b=1000
		int sum = 0; //��ȯ�뵵
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
}
