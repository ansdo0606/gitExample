package ch14;

import java.util.Scanner;

public class Book {
	private String bookName;
	private String press;
	private int price;//�ܰ�
	private int amount;//�Ǹż���
	private int money;//�Ǹűݾ�(�ܰ�x�Ǹż���)
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ : ");
		bookName=scan.next();
		System.out.print("���ǻ� : ");
		press=scan.next();
		System.out.print("�ܰ� : ");
		price=scan.nextInt();
		System.out.print("���� : ");
		amount=scan.nextInt();
		
		money=price*amount;
	}
	
	
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
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
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
