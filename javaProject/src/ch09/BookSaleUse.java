package ch09;

public class BookSaleUse {

	public static void main(String[] args) {
		BookSale b1=new BookSale();
		//�θ�Ŭ���� �ɹ�ȣ��
		b1.setBookName("Java");
		b1.setPress("���");
		b1.setAuthor("��ö��");
		b1.setYear(2022);
		b1.setPrice(30000);
		
		//�ڽ�Ŭ������ �ɹ�ȣ��
		b1.setAmount(500);
		b1.setMoney();
		b1.setRank(1);
		b1.print();
		
	}

}
