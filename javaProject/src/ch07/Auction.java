package ch07;

public class Auction {
	private String name; 
	private String id;
	private int tot;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public String getGrade() {
		if (tot >= 100000 ) {
			grade = "gold";
		} else {
			grade = "silver";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+tot+"\t"+getGrade());
	}
	
}
