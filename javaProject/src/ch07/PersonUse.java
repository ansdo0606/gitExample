package ch07;

public class PersonUse {

	public static void main(String[] args) {
		//Ư�� Ŭ������ ����ϱ� ���ؼ��� �޸𸮿� �÷�����
		Person p1 = new Person(); //��ü����, �ν��Ͻ�ȭ => �޸𸮿� �ø��� �۾�
		p1.setName("��ö��");
		p1.setAge(20); 
		p1.setHeight(180.0);
		//p1.print(); 
		System.out.println("�̸� : "+p1.getName());
		System.out.println("���� : "+p1.getAge());
		System.out.println("Ű : "+p1.getHeight());
	}

}
