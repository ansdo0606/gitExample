package ch10;

//final ���� => ���
//�빮�ڷ� �ۼ�,2�ܾ� �̻��� ��� _�� ����
//�ʱⰪ�� �ݵ�� �ʿ���
//���� �����Ҽ� ����
public class FinalVar {
	final static int MAX_NUM=500;
	//�ݵ�� �ʱ�ȭ�� ����� �Ѵ�.
	//final static int MAX_NUM; =>������
	//����� �������(����)�϶� ���� �ϸ� ������
	public static void main(String[] args) {
		int max =100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NUM=200;  //finaló���� ���������� ���� �����Ҽ� ����
	}
	}

