package ch10;


class T{
	private int num = 10;
	public final void print() {//�������̵� �ȵȴ�
		System.out.println(num);
	}
}
public class FinalMethod2 extends T{
	int num = 100;
/*	@Override
 * public void print() {
		super.print();
*/	
	public static void main(String[] args) {
		//��Ӱ��谡 ����� �������� �ڽ� Ŭ������ ��ü�����ϸ� �θ�Ŭ������ �ڵ������Ѵ�.
		FinalMethod2 f=new FinalMethod2();
		f.print();
	}
}
