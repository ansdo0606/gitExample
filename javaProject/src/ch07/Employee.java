package ch07;


public class Employee {
	private String name;
	private String part;//�μ�
	private String position;//����
	private int basic;//�⺻��
	private int bonus;//���ʽ�(�⺻���� 300%)
	private int total;//�Ѿ�(�⺻��+���ʽ�)
	private int tax;//����(�Ѿ��� 3.3%)
	private int salary;//�Ǽ��ɾ�(�Ѿ�-����)
	
	//�Ϲݸ޼ҵ� �ڸ�
	public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
	}
	public void calc() {
		bonus = basic*3;//���ʽ� (�⺻���� 300%)
		total = basic+bonus;//�Ѿ�(�⺻��+���ʽ�)
		tax = (int)(total*0.033); //=> ��������ȯ ����� ����ȯ
		salary = total-tax;//�Ǽ��ɾ�(�Ѿ�-����)
	} 
	//��¿뵵
	public void print() {
		System.out.println("�̸�\t�μ�\t����\t�⺻��\t���ʽ�\t�Ѿ�\t����\t�Ǽ��ɾ�");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+
		total+"\t"+tax+"\t"+salary);
	}
	
	
		
	
}
