package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		//1번째 생성및 getInstance()호출
		MyManager mgrobj = MyManager.getInstance();
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		
		//2번째 생성및 호출
		MyManager newobj = MyManager.getInstance();
		System.out.println(newobj);//위 주소값과 같다
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		}

}
