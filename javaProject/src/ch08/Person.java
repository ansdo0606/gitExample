package ch08;

public class Person {
	//�ɹ�����
	private String name;//ȫ�浿  �߽ż�  ����ȣ
	private int height;//170  190   185
	private int weight;//60  100   70
	
	//this()�ٸ������� ȣ��
	public Person() {// �⺻������(default constructor)
		this("ȫ�浿",170,60);//(String, int,int)
		
	}
	public Person(String name) {//name=�߽ż�
		this(name,190,100);//(String,int,int)
	}
	public Person(String name,int height) {//name = ����ȣ ,height = 185
		this(name,height,70);//
		
	}
	public Person(String name,int height,int weight) {//name = ȫ�浿 ,170,60
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//��¿뵵
	public void showInfo() {
		System.out.println("===�Ż� ����===");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+height);
		System.out.println("ü�� : "+weight);
	}
}
