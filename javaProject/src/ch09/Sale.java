package ch09;

public class Sale extends Product{
	private int price;
	private int amount;
	private int money;
	
	public void input(int code,String name,String company, 
			String date,int price, int amount) {
		//�θ��� privateó���� ��������� ���� �ʱ�ȭ �Ҷ��� setter�� Ȱ��
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		//�ڳ����� privateó�� �Ǿ�� �󸶵� ������ ���������� ����
		this.price = price;
		this.amount = amount;
		
	}
	public void calc() {
		money = price*amount;
	}
	public void print() {
		System.out.println("�ڵ�\t��ǰ��\t������\t��������\t�ܰ�\t����\t�ݾ�(����:õ��)");
		System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()+"\t"
		+getDate()+"\t"+price+"\t"+amount+"\t"+money);
	}
	
}
