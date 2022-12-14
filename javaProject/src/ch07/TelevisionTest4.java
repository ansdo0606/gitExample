package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
		Television myTv = new Television();//객체생성
		myTv.channel =11;
		myTv.volume = 9;
		myTv.onoff = true;
		int ch = myTv.getChannel(); //받을때도 같은 타입으로 받아야 한다.
		System.out.println("현재 채널은 " + ch + "입니다.");
		
	}

}
