package ch10;

public class StaticMethod2 {
	static int num=10; //���
	static String name="ȫ�浿";
	String email="hong@gmail.com";
	String hp="010-1234-5678";
	String addr="���� ������ ���ﵿ";
	
	public static void printA() {
	System.out.println("====printA()====");
	System.out.println("��� : "+num);
	System.out.println("�̸� : "+name);
	StaticMethod2 s=new StaticMethod2();
	System.out.println("�̸��� : "+s.email);
	System.out.println("��ȭ : "+s.hp);
	System.out.println("�ּ� : "+s.addr);
	}
	
	public void printB() {
		System.out.println("====printB()====");
		System.out.println("��� : "+num);
		System.out.println("�̸� : "+name);
		System.out.println("�̸��� : "+email);
		System.out.println("��ȭ : "+hp);
		System.out.println("�ּ� : "+addr);
	}
	public static void main(String[] args) {
		printA();
		System.out.println();
		StaticMethod2 a=new StaticMethod2();
		a.printB();
	}

}
