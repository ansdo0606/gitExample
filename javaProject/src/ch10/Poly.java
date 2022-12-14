package ch10;

class K{ //부모클래스
	int a =10;
	public void print() {
		System.out.println(a);
	}
}
class V extends K{//자식클래스
	int a=20;
	@Override
	public void print() {
		System.out.println(a);
	}
}


public class Poly {
	public static void main(String[] args) {
		V a=new V();
		a.print();
		K b =new K();
		b.print();
		
		//반드시 좌변은 부모클래스 = 우변은 자식클래스 
		K c=new V();//다형성 (좌:부 = 우:자)
		c.print();
		//다형성을 쓸떄는 참조변수가 가리키는 객체가 사용하고자하는 객체가 맞는지 검사할때 
		//instanceof 연산자를 사용할수있다.
		
		System.out.println("c instanceof V? : "+(c instanceof V));
		
	}
}
