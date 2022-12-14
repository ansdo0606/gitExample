package ch10;

public class Ch3 extends Pa3{
	String email = "hong@gmail.com";
	@Override
	public void print() {
		super.print();//부모쪽 print 호풀
		System.out.println("나이 : "+email);
	}
}