package ch09;

public class BookSale extends Book{
	//�������
	private int amount;//�Ǹż���
	private int rank;//�Ǹż���
	private int money;//�Ǹűݾ�(�ܰ�X����,�ݾ� 10���� �ʰ��� 10%����)
	
	//getter,setter
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	/*public int getMoney() {
		return money;
	}*/
	public void setMoney() {//
		money = getPrice()*amount;
		if (money >100000) {
			money=(int)(money*0.9);
		}
	}
	public void print() {
		System.out.println("������\t���ǻ�\t����\t���ǿ���\t�ܰ�\t����\t�ݾ�\t�Ǹż���");
		System.out.println(getBookName()+"\t"+getPress()+"\t"+getAuthor()+"\t"
		+getYear()+"\t"+getPrice()+"\t"+amount+"\t"+money+"\t"+rank);
	}
	
	
	
	
}
