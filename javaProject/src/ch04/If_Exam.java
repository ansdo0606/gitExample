package ch04;

public class If_Exam {

	public static void main(String[] args) {
		//if문
		int a = 10; //짝수라면 if문 실행함,홀수라면 실행 안함
		if (a % 2 == 0 ) {// a를 2로 나눈 나머지가 0이면?
			System.out.println(a + "는 짝수입이다.");
		} //end if
		System.out.println("if문이 끝난 이후 그 다음 명령문을 수행한다.");
	} //end main

} // end class
