package ch07;

//getter,setter�� �ȸ���� �����ϴ� ���
public class Student2 {
	//�������
	private String name;//�̸�
	private String major;//����
	private int year;//�г�
	private String num;//�й�
	private double point;//�������
	private int money;//��ϱ�
	private int save;//���б�
	
	//��������
	public void input(String name, String major,int year,String num,double point,int money) {
		this.name = name;
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;
		if (point >= 4.3) {
			save = money;
		}else if (point >= 4.0) {
			save = 250;
		}else if (point >= 3.5) {
			save = 100;
		}
	}
	public void print() {
		System.out.println("�̸�\t����\t�г�\t�й�\t�������\t��ϱ�\t���б�");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+
				"\t"+money+"\t"+save);
	}
	//�����ڿ� �޼ҵ�
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}
	
}
