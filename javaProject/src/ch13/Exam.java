package ch13;

//import java.lang.*;�� ������ �Ǿ��� ����

public class Exam { //extends Object�� �����Ǿ� ����

	public static void main(String[] args) {
		String a = "hello";//String Pool�̶�� �޸� ������ ���� �����.
		System.out.println(System.identityHashCode(a));
		//identityHashCode : String�� ���� ��ü�ּ� Ȯ�ο� �޼ҵ�
		String b = "hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);// �ּҰ� ��(true => �ּҰ��� ����)
		
		String c = new String("hello");//new�� ���� ��ü ����
		System.out.println(System.identityHashCode(c));
		String d = new String("hello");//new�� ���� ��ü ������ �ϸ� ���ο� �ּҰ��� ������ �ȴ�.
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);//�ּҰ� ��(false => �ּҰ��� �ٸ���)
		System.out.println(c.equals(d));//������ �� (true => ������ ����.)
	}

}
