package ch10;

class K{ //�θ�Ŭ����
	int a =10;
	public void print() {
		System.out.println(a);
	}
}
class V extends K{//�ڽ�Ŭ����
	int a=20;
	@Override
	public void print() {
		System.out.println(a);
	}
}


public class Poly {
	public static void main(String[] args) {
		V a=new V();
		a.print();
		K b =new K();
		b.print();
		
		//�ݵ�� �º��� �θ�Ŭ���� = �캯�� �ڽ�Ŭ���� 
		K c=new V();//������ (��:�� = ��:��)
		c.print();
		//�������� ������ ���������� ����Ű�� ��ü�� ����ϰ����ϴ� ��ü�� �´��� �˻��Ҷ� 
		//instanceof �����ڸ� ����Ҽ��ִ�.
		
		System.out.println("c instanceof V? : "+(c instanceof V));
		
	}
}
