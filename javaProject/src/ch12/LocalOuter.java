package ch12;

public class LocalOuter {
	private int data =30;
	void display() {//LocalOuter�� ����޼ҵ�
		class LocalInner{//��������Ŭ����(�޼ҵ� �ȿ��� ����)
			void msg() {//LocalInner�� ����޼ҵ�
				System.out.println(data);
			}
		}//end inner class
		LocalInner li=new LocalInner();//���ΰ�ü����
		li.msg();
		
	}//end method
	
	public static void main(String[] args) {
		LocalOuter lo=new LocalOuter();
		lo.display();
	}
	
}
