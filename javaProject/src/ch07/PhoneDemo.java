package ch07;

//�Ѱ��� ���Ͽ� 2���̻��� class������ �ۼ��ÿ���
//public class�� Ŭ���� �̸����� ����, publicó��, ������ Ŭ������ default�� ó��
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value + "����¥��" + model + "����Ʈ��");
	}
}

public class PhoneDemo { 

	public static void main(String[] args) {
		Phone myPhone = new Phone(); //��ü����
		myPhone.model = "������ 22";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "iPhone";
		yourPhone.value = 150;
		yourPhone.print();
			
	}

}
