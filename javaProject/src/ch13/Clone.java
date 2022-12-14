package ch13;

//�ν��Ͻ��� �����Ϸ��� Cloneable �������̽��� �����ؾ���
public class Clone implements Cloneable{
	int num = 10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		try {//���ܰ� �߻��Ҹ��� ���ɼ��� �ڵ� ó��
		t2=(Clone)t1.clone();//�ν��Ͻ��� ������,Object�� �޼ҵ��̱� ������ 
		//�º��� ���߱� ���ؼ� (Clone)����ȯ�ؾ��Ѵ�
		
		} catch (CloneNotSupportedException e) {//���ܰ� �߻��� �������� �۵��Ѵ�
			e.printStackTrace();//�����ڸ� ���� ����� �������� �뵵�� �޼ҵ�
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}
}
