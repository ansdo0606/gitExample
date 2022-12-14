package ch10;

//static =>메모리에 바로 로딩
//nonstatic => 객체생성 후에 로딩
public class A {
	//멤버변수
	String name = "Kim";//nonstatic member
	static int n = 20; //static member
	//멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}
	public static void main(String[] args) {// static member 
		//static끼리는 자료공유가 자유로움
		//지역변수
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);
		
		A  aa = new A(); // nonstatic member는 객체생성 후에 사용 가능하다
		System.out.println(aa.name);
	}

}
