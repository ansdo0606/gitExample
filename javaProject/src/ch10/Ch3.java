package ch10;

public class Ch3 extends Pa3{
	String email = "hong@gmail.com";
	@Override
	public void print() {
		super.print();//�θ��� print ȣǮ
		System.out.println("���� : "+email);
	}
}