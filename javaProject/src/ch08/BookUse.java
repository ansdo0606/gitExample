package ch08;

public class BookUse {

	public static void main(String[] args) {
		
		Book b= new Book("Java","홍길동","영찬",2019,35000,5);
		//b.input("DB","아무개","한빛",2021,25000,3); 일반메소드 활용법
		b.print();
		
		Book b2 = new Book();
		b2.print();
	}

}
