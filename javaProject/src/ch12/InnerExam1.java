package ch12;

public class InnerExam1 {
	class Cal{//���(�ʵ�)������ �����ϴ� ��ġ�� �ִ� ���� �ν��Ͻ� Ŭ����(��øŬ����)��� �Ѵ�.
		int value = 0;
		public void plus() {
			value++;
		}
	}//end inner class
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();//1.�ܺΰ�ü ����
		//�ܺ�Ŭ���� �̸�.����Ŭ�����̸� �������� = �ܺ���������.new ����Ŭ���� ������();
		InnerExam1.Cal cal = t.new Cal();//2.���ΰ�ü ����
		cal.plus();
		System.out.println(cal.value);
	}
}
