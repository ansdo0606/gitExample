package ch07;

public class Student {
	//�������
	private String name;//�̸�
	private String major;//����
	private int year;//�г�
	private String num;//
	private double point;
	private int money;
	private int save;
	
	//��� �޼ҵ�
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSave() {
		//���б� ���(���� 3.5 �̻��̸� 100����, 4.0 �̻� 250����,4.3�̻� ����)
		if (point >= 4.3) {
			save = money;
		}else if (point >= 4.0) {
			save = 250;
		}else if (point >= 3.5) {
			save = 100;
		}
		
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	
	public void print() {
		System.out.println("�̸�\t����\t�г�\t�й�\t�������\t��ϱ�\t���б�");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+
				"\t"+money+"\t"+getSave());
	}
}
