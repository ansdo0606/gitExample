package ch10;

public class OverloadEx {
	//Overload �޼ҵ� �̸��� ���� �ڷ��� �Ǵ� �Ű������� �޶����
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
