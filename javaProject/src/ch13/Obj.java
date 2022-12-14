package ch13;

public class Obj {//extends Object가 생략되어 있음
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());//클래스의 정보
		System.out.println(e1);
		System.out.println(e1.toString());//Object를 문자열로 변환
		
 	}
	
}
