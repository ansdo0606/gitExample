package ch07;

public class PersonUse2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(); //��ü����, �ν��Ͻ�ȭ => �޸𸮿� �ø��� �۾�
		p1.setName("ȫ�浿");
		p1.setAge(30); 
		p1.setEmail("hong@naver.com");
		p1.setAddress("���� ������ ���ﵿ");
		p1.print();
		
		System.out.println();
		
		Person2 p2 = new Person2(); //��ü����, �ν��Ͻ�ȭ => �޸𸮿� �ø��� �۾�
		p2.setName("���Ӵ�");
		p2.setAge(25); 
		p2.setEmail("saimdang@gmail.com");
		p2.setAddress("���� ������ ���ʵ�");
		p2.print();
	}

}
