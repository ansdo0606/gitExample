package ch12;



interface RemoteControl{
	//�߻�޼ҵ�
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac=new RemoteControl() {
			//�߻�Ŭ������ interface��  new�ؼ� ��ü������ ���Ѵ�.������ ����Ŭ���� ó���ϸ�
			//�ڵ������� interface�� RemoteControl�� ����Ŭ������ ��ӹ޾� �������̵� �Ҽ� �ִ�.
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");
			}
		 
			
		};//������Ŭ����
		ac.turnOn();
		ac.turnOff();
		
		}
	}

