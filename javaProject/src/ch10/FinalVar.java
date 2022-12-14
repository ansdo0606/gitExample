package ch10;

//final 변수 => 상수
//대문자로 작성,2단어 이상일 경우 _로 연결
//초기값이 반드시 필요함
//값을 변경할수 없다
public class FinalVar {
	final static int MAX_NUM=500;
	//반드시 초기화를 해줘야 한다.
	//final static int MAX_NUM; =>에러남
	//상수는 멤버변수(전역)일때 선언만 하면 에러남
	public static void main(String[] args) {
		int max =100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		//MAX_NUM=200;  //final처리한 참조변수는 값을 수정할수 없음
	}
	}

