package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		//1��° ������ getInstance()ȣ��
		MyManager mgrobj = MyManager.getInstance();
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		
		//2��° ������ ȣ��
		MyManager newobj = MyManager.getInstance();
		System.out.println(newobj);//�� �ּҰ��� ����
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		}

}
