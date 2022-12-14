package ch06;
//재귀호출 - 실제 잘 사용 안함(메모리 증가)
//factorial 계산 :5!=5x4x3x2x1
public class RecursiveEx {

	static long fact1(int n) {  //5
		return n == 1 ? 1 : n*fact1(n-1);  //데이터 타입과 갯수가 맞아야 함
	}
	public static void main(String[] args) {
		System.out.println(fact1(5));
	}
}
