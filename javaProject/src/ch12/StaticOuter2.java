package ch12;

public class StaticOuter2 {
	static int data=30;//static
	int data2=50;//non-static
	static class StaticInner2{//static ����Ŭ����
		void msg() {
			System.out.println("data is "+data);//static ����� �����Ӱ� ����
			//System.out.println("data is "+data2);//non-static����� ��� �Ұ���
		}
	}
	
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();//����staticŬ���� ����
		in.msg();
	}

}

