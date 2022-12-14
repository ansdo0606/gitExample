package ch16;

public class MyBank {
	public synchronized void bankUserA() {
		for (int i= 1; i <= 5; i++) {//1초 이하로 쉬면서 10번 반복
			System.out.println("홍길동님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void bankUserB() {
		for (int i= 2; i <= 6; i++) {//1초 이하로 쉬면서 10번 반복
			System.out.println("사임당님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void bankUserC() {
		for (int i= 3; i <= 7; i++) {//1초 이하로 쉬면서 10번 반복
			System.out.println("이몽룡님의 통장잔고는 "+(i*10)+"만원입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//for
	}
}
