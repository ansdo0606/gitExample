package ch13;

public class AutoBox2 {
	public static void main(String[] args) {
		//기본자료형
		int num1 = 30;
		int num2;
		int num3;
		
		// 참조자료형
		Integer i1;//선언만 했을때는 i1의 값은 null상태
		Integer i2 = new Integer(40);//auto boxing(기본자료형 리터럴을 객체로 박스처리)
		Integer i3 = new Integer(50);
		
		i1 = num1;//기본자료형인 int와 객체자료형인 Wrapper Class인 Intger는 호환된다.
		num2 = i2;//auto unboxing(객체 안에 들어있는 값을 풀어서 저장)
		num3 = i3;
		
		System.out.println("기본자료형 : "+num1+", 객체자료형 : "+i1);
		System.out.println("기본자료형 : "+num2+", 객체자료형 : "+i2);
		System.out.println("기본자료형 : "+num3+", 객체자료형 : "+i3);
		
	}

}
 

