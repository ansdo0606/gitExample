package ch13;

public class ObjCast {

	public static void main(String[] args) {
		int a = 10;//�⺻�ڷ���
		Object obj = 20;//�����ڷ��� /��:��, ��:��(������)
		
		a = (Integer)obj;//�������� ����ȯ
		a = (int)obj;//���� obj�� ��ü���̱� ������ �⺻�ڷ���(int)�� �ϸ� �ȵȴ��ֽŹ��������� ���
		
		System.out.println(a);
		//Object �迭 : �پ��� �ڷ��� ����� ����
		Object[] obj2 = {100,100.5,true,"hello",'A'};
		//����� �� �����Ͱ� Object ��ü(Integer,Double,Boolean��...)�� �Ǿ������.(����ڽ�)
		//�׷��� �޸� ���� ���ϴ�. �̷��� ����ϴ� ���� ����.��� �÷��� ó�� (ArrayList��...)��
		//����ϸ� ������ �����Ҽ� �ִ�.
		for (Object o : obj2) {//for each��, ���� for��, Ȯ��for��
			System.out.println(o);//�����ڽ�
		}
	}

}
