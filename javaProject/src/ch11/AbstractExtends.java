package ch11;

public class AbstractExtends extends AbstractClass{

	//�������̵��� �θ��ʿ� �ִ� �̿ϼ��� �޼ҵ带 �����ϴ� �ǹ̵� ����
	@Override
	void method() {//�߰�ȣ�� �߿���
		System.out.println("�߻� method�� �ϼ��� method");
	}
	public static void main(String[] args) {
		//AbstractClass a = new AbstractClass(); ������ : �߻�޼ҵ尡 �ִ� �߻�Ŭ����,
		//�������̽��̰� new�� ���ؼ� �ν��Ͻ�ȭ�� �� ����. ��,������ ��ü������ �ȵȴ�.
		AbstractExtends ex = new AbstractExtends();
		ex.method();
		ex.method2();
	}
}
