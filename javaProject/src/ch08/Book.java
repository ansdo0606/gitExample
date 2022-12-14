package ch08;

public class Book {
	//멤버변수
	private String bookName;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;
	
	public Book() {//기본생성자
		this("자바", "김선생", "한빛", 2022, 20000, 15);//다른생성자 호출시 반드시 첫째줄에서 호출
		System.out.println("기본 생성자 호출");
		
	}
	// 매개변수가 있는 생성자
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price*amount;
	}
	
	/*일반메소드 활용법
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
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"
		+amount+"\t"+money);
	}
	
		
	
}
