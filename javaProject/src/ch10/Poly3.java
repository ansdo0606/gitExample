package ch10;


public class Poly3 {
	public static void main(String[] args) {
		String tel="010-1234-5678";
		String addr="서울 강남구 역삼동";
		Pa3 c = new Ch3();//다형성
		c.print();
		System.out.println("전화번호 : "+tel);
		System.out.println("주소 : "+addr);
	}
}
