package ch06;


public class StudentPoint {

	static String[] name = {"홍길동","사임당","이순신"};
	static int[] number = {1001,1002,1003};
	static int[] java = {90,95,84};
	static int[] db = {85,79,92};
	static int[] html = {99,88,95};
	static int[] jsp = {76,92,72};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0,0.0,0.0};
	
	//총점계산용도
	static void getTot() {
		for (int i = 0; i < 3; i++) {
			tot[i] = java[i] + db[i] +html[i]+jsp[i];
			
		}
	}
	//평균 계산
	static void getAvg() {
		for (int i = 0; i < 3; i++) {
			avg[i] = tot[i]/4.0;
		}
	}
	
	//출력용도
	static void print() {
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(number[i]+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"+html[i]+
					"\t"+jsp[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("전체 학생수 : 3명");
		System.out.println("--------------------------------------------------------------------------");
		getTot(); //총점계산
		getAvg(); //평균계산
		print();  // 출력
		System.out.println("--------------------------------------------------------------------------");
	}
}
