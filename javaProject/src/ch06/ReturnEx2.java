package ch06;

public class ReturnEx2 {

	public static void main(String[] args) {
		printScore(101);
	}

	private static void printScore(int score) { //score = 99
		if(score <=0 || score >= 100) {
			System.out.println("잘못된 점수 : " + score);
			return; //메소드 종료
		}
		System.out.println("점수 : "+ score);
	}

}
