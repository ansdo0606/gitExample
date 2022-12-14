package ch14;

import java.util.Scanner;

public class Product {
	private String num;
	private String name;
	private String company;
	private int price;
	private int amount;
	private int money;
	
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("제품번호 : ");
		num=scanner.next();
		System.out.print("제품명 : ");
		name=scanner.next();
		System.out.print("제조사 : ");
		company=scanner.next();
		System.out.print("단가 : ");
		price=scanner.nextInt();
		System.out.print("수량 : ");
		amount=scanner.nextInt();
		
		money=price*amount;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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
