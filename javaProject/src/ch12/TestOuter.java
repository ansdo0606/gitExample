package ch12;

public class TestOuter {
	//�������
	private int data = 30;//TestOuter�� �������
	class Inner {//��ø Ŭ����
		void msg() {//Inner�� ��� �޼ҵ�
			System.out.println("data is "+ data);
			//��øŬ���������� �ܺ�Ŭ������ private ��������� ���� �ִ�.
		}
	}//end inner class
	public static void main(String[] args) {
		TestOuter obj =new TestOuter();//1)�ܺΰ�ü ����
		TestOuter.Inner in = obj.new Inner();//2)���ΰ�ü ����
		in.msg();
	}
}
