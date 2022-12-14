package ch08;

public class Member {
	private String name;
	private String id;
	private int price;
	private String grade;
	
	public Member() {
		
	}
	public Member(String name, String id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	
		
		if (price >= 100000) {
			grade = "gold";
		}else if (price < 100000) {
			grade = "silver";
		}
	}
	public void print() {
		System.out.println("-----------------------------------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("-----------------------------------------------------");

		System.out.println(name+"\t"+id+"\t"+price+"\t"+grade);
	}
}
