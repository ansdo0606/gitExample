package ch08;

public class BookUse {

	public static void main(String[] args) {
		
		Book b= new Book("Java","ȫ�浿","����",2019,35000,5);
		//b.input("DB","�ƹ���","�Ѻ�",2021,25000,3); �Ϲݸ޼ҵ� Ȱ���
		b.print();
		
		Book b2 = new Book();
		b2.print();
	}

}
