package ch12;


public class MemberOuter {
	//멤버변수
		private int num = 1;//TestOuter의 멤버변수
		private String name ="홍길동";
		private String email = "hong@gmail.com";
		class MemberInner {//중첩 클래스
			void msg() {//Inner의 멤버 메소드
				System.out.println("-----------------------------");
				System.out.println("고객번호 : "+ num);
				System.out.println("이름 : "+ name);
				System.out.println("이메일 : "+email);
				System.out.println("-----------------------------");
				//중첩클래스에서는 외부클래스의 private 멤버변수도 쓸수 있다.
			}
		}//end inner class
		public static void main(String[] args) {
			MemberOuter m =new MemberOuter();//1)외부객체 생성
			MemberOuter.MemberInner in = m.new MemberInner();//2)내부객체 생성
			in.msg();
		}
}
