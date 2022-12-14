package ch12;

class Outer{
	class InstanceInner{//����Ŭ����
		int a = 100;//non-static
	}
	static class StaticInner{//static ����Ŭ����
		int a =200;//non- static
		static int b =300;//static
	}
	void myMethod() {//Outer�� ����޼ҵ�
		class LocalInner{//������øŬ����
			int a = 400;//non-static
		}//end inner class
		LocalInner i = new LocalInner();
		System.out.println("i.a : "+i.a);
	}//end method
}
public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc=new Outer();
		Outer.InstanceInner i=oc.new InstanceInner();
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b : "+Outer.StaticInner.b);
		
		//non- static ����� staticŬ���� �ȿ� �ִ��� �ݵ�� new�� ���� �������� ����ؾ��Ѵ�.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.a : "+si.a);
		
		oc.myMethod();
	}
}
