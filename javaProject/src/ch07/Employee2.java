package ch07;

public class Employee2 {
	private String name;
	private String part;//�μ�
	private String position;//����
	private int basic;//�⺻��
	private int bonus;//���ʽ�(�⺻���� 300%)
	private int total;//�Ѿ�(�⺻��+���ʽ�)
	private int tax;//����(�Ѿ��� 3.3%)
	private int salary;//�Ǽ��ɾ�(�Ѿ�-����)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		bonus = basic*3;//���ʽ� (�⺻���� 300%)
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getTotal() {
		total = basic+bonus;//�Ѿ�(�⺻��+���ʽ�)
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTax() {
		tax = (int)(total*0.033); //=> ��������ȯ ����� ����ȯ
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSalary() {
		salary = total-tax;//�Ǽ��ɾ�(�Ѿ�-����)
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void print() {
		System.out.println("�̸�\t�μ�\t����\t�⺻��\t���ʽ�\t�Ѿ�\t����\t�Ǽ��ɾ�");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+getBonus()+"\t"+
		getTotal()+"\t"+getTax()+"\t"+getSalary());
	}
	
}
