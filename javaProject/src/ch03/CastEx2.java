package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a;//자동형변환
		System.out.println("int a => double :" + d);
		
		/*int e = b;// 실수형이 더 크기 때문에 오류가 남*/
		int e = (int)b;//강제 형변환 (명시적형변환)
		System.out.println("float b => int : " + e);
		
		byte f = (byte) c;
		System.out.println("Int c => byte : " + f);
		
		
		
		
	}

}
