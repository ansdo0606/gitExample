package ch10;

class Test11{
	public void print() {
		System.out.println("test11");
	}
}
class Test22 extends Test11{
	@Override
	public void print() { //�������̵�:��Ӱ� ������ �ִ�.
		System.out.println("test22");
		super.print();//�θ�޼ҵ� ȣ��
	}
}
public class OverrideEx {
	public static void main(String[] args) {
		Test22 t =new Test22();
		t.print();
	}
}