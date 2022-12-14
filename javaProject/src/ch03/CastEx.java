package ch03;

public class CastEx {
//자료형변환(중요)
	public static void main(String[] args) {
		float f = 1.6f;//float만큼은 뒤에 f를 적어줘야 한다. 4바이트로 저장
		System.out.println(f);
		
		f = 100;//자동형변환(정수100을 자동으로 float형 실수 100.0f로 변환
		System.out.println(f);
		
		f = 100.5F;
	/*	int i = f;//정수 타입에 실수 f는 대입이 불가능 하기 때문에 에러가 남*/
		int i = (int)f;//강제 형변환
		System.out.println(i);//값 손실이 있을 수 있다.
		
		
		
	}

}
