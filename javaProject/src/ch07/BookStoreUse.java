package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore bs = new BookStore();//��ü������ ���ÿ� �⺻������ ȣ��, 
		bs.setBookName("Java");
		bs.setAuthor("�輱��");
		bs.setPress("����");
		bs.setYear(2022);
		bs.setAmount(10);
		bs.setPrice(30000);
		
		//���
		bs.print();
	}

}
