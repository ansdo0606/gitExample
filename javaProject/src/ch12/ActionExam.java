package ch12;

abstract class Action{//�߻�Ŭ����
	public abstract void exec();//�߻�޼ҵ�
}




public class ActionExam extends Action{

	@Override
	public void exec() {
		System.out.println("I am Child");
	}
	public static void main(String[] args) {
		Action a=new ActionExam() { //�͸� ���� Ŭ���� 
			String name = "Kim";
			@Override
			public void exec() {
				System.out.println("���� "+ name + "�̴�.");
			}
		};//������ : �͸� ���� Ŭ������ ������ �߰�ȣ �������� �����ݷ�(;)�� ��õǾ�� �Ѵ�.
		a.exec();
	}

}
