package ch10;

public class StaticVarUse2 {
	public static void main(String[] args) {
		//static => Ŭ�����̸����� �����Ҽ� �ִ� ��ü���� �ʿ� X
		System.out.println(StaticVar2.total);
		
		StaticVar2 car1 = new StaticVar2("�Ÿ");//�ν��Ͻ� ���� �� �Ű������� �ִ� ������ ȣ��
		StaticVar2 car2 = new StaticVar2("���");//�ν��Ͻ� ���� �� �Ű������� �ִ� ������ ȣ��
		StaticVar2 car3 = new StaticVar2("�ƹݶ�");//�ν��Ͻ� ���� �� �Ű������� �ִ� ������ ȣ��
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
		
	}
}
