package ch14;

public class EC {
	private int no; //�ֹ���ȣ
	private String orderDate; //�ֹ�����
	private String product; //�ֹ���ǰ
	private String cardName; //ī���
	private String cardNo; //ī���ȣ
	private int pay; //�����ݾ�
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPay() {
		
		return String.format("%,d", pay);
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	public EC() {
		super();
	}
	public EC(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}
	
	
	
	
	
	
	
}
