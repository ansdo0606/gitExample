package ch12;

public class InnerExam3 {
	public void exec() {//��� �޼ҵ�
		class Cal{ //�޼ҵ� �ȿ� class ����
			int value = 0;
			public void plus() {
				value++;
			}
		}//end inner class
		Cal cal = new Cal();//3)�޼ҵ� �ȿ��� ������øŬ������ ����
		cal.plus();//4)������øŬ���� �ȿ� �ִ� ��� �޼ҵ� ȣ��
		System.out.println(cal.value);
		
	}//end method
	public static void main(String[] args) {
		//������øŬ������ �����Ϸ���
		InnerExam3 t = new InnerExam3();//1)�ܺ�Ŭ���� ����
		t.exec();//2)������øŬ������ �ִ� �ܺ�Ŭ������ ����޼ҵ带 ȣ��
	}
	
}
