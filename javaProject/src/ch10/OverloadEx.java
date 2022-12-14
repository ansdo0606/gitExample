package ch10;

public class OverloadEx {
	//Overload 메소드 이름은 같고 자료형 또는 매개변수가 달라야함
	public void PutData(String a) {
		System.out.println(a);
	}
	public void PutData(int a) {
		System.out.println(a);
	}
	public void PutData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		OverloadEx o =new OverloadEx();
		o.PutData("hello");
		o.PutData(5);
		o.PutData(3.5);
	}
}
