package ch09;

public class Shape {
	//�������
	private String name;//"Circle"

	public Shape() {
		super();//objectŬ������ �⺻������ ȣ��
	}
	public Shape(String name) {//name="Circle"
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//�Ϲݸ޼ҵ�
	public double calculateArea() {
		return 0;
	}
	public void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}
