package ch07;

public class BookStore {
	private String bookName; //å�̸�
	private String author; //����
	private String press;//���ǻ� 
	private int year;
	private int price;
	private int amount;
	private int money;

	//getter,setter
	//public Bookstore(){}���� ������ �ʰ� ������
	//public Bookstore(int a){}
	//�Ű������� �ִ� �����ڸ� ���� ������ٸ� ���̻� JVM�� �⺻�����ڸ� �ȸ����. ���� 
	//�����ڰ� �⺻�����ڵ� ��������� ����� �־�� �Ѵ�.
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		money=price*amount;
		return money;
	}
	/*public void setMoney(int money) {
		this.money = money;
	}*/
	//��¿뵵
	public void print() {
		System.out.println("������\t����\t���ǻ�\t���ǿ���\t����\t�Ǹż���\t�Ǹűݾ�");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+
		price+"\t"+amount+"\t"+getMoney());
	}
	
	
	
}
