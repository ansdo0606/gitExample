package ch07;

public class Person {
	//�������(����,�ʵ�)�� �����ʹ� �߿��ϱ� ������ ĸ��ȭ�� �ؾ��Ѵ�.
	private String name; //��ö��
	private int age; //20
	private double height;//180.0
	//public���� ó���� �޼ҵ带 Ȱ���Ͽ� privateó���� ��������� �����Ҽ� �ִ�.
	//getter, setter Ȱ��
	public String getName() {//�����͸� get
		return name;
	}
	public void setName(String name) { //�����͸� set
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("�Է°��� ��Ȯ���� �ʽ��ϴ�.");
		}else {
			this.age = age;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void print() {
		System.out.println("�̸�:"+name+"����:"+age+"Ű:"+height);
	}
}
