package ch06;

public class CallStackTest2 {

	public static void main(String[] args) { //프로그램 시작
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod(); //firstMethod 호출
		System.out.println("main(String[] args)이 끝났음.");
	}//프로그램 종료

	private static void firstMethod() { //호출받음
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod(); //secondMethod호출
		System.out.println("firstMethod()이 끝났음."); //firstMethod끝남
	}

	private static void secondMethod() { //호출받음
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}//secondMethod 끝남

}
