package ch12;

public class InnerExam2 {
	static class Cal{ //���� static Ŭ����
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		//���� static Ŭ������ �����Ҷ�
		//�ܺ�Ŭ���� �̸�.����Ŭ���� �̸� �������� = new �ܺ�Ŭ���� �̸�.����Ŭ�����̸�
		InnerExam2.Cal cal=new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
}
