package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p1 = new Person();//��ü ������ �⺻������ ȣ��
		p1.showInfo();
		
		Person p2 = new Person("�߽ż�");//Person(String)������ �����ڸ� ȣ��
		p2.showInfo();
		
		Person p3 = new Person("����ȣ",185);//Person(String,int)������ �����ڸ� ȣ��
		p3.showInfo();
		
		Person p4 = new Person("���ڿ�",175,72);//Person(String,int,int)
		p4.showInfo();
	}

}
