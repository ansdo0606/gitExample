package ch08;

public class Book {
	//�������
	private String bookName;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;
	
	public Book() {//�⺻������
		this("�ڹ�", "�輱��", "�Ѻ�", 2022, 20000, 15);//�ٸ������� ȣ��� �ݵ�� ù°�ٿ��� ȣ��
		System.out.println("�⺻ ������ ȣ��");
		
	}
	// �Ű������� �ִ� ������
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	
	/*�Ϲݸ޼ҵ� Ȱ���
	 * public void input(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}*/
	public void print() {
		System.out.println("������\t����\t���ǻ�\t���ǿ���\t����\t�Ǹż���\t�Ǹűݾ�");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"
		+amount+"\t"+money);
	}
	
		
	
}
