package ch13;

public class ObjCast {

	public static void main(String[] args) {
		int a = 10;//기본자료형
		Object obj = 20;//참조자료형 /좌:부, 우:자(다형성)
		
		a = (Integer)obj;//정상적인 형변환
		a = (int)obj;//원래 obj가 객체형이기 떄문에 기본자료형(int)로 하면 안된다최신번전에서는 허용
		
		System.out.println(a);
		//Object 배열 : 다양한 자료형 사용이 가능
		Object[] obj2 = {100,100.5,true,"hello",'A'};
		//사실은 각 데이터가 Object 객체(Integer,Double,Boolean등...)가 되어버린다.(오토박싱)
		//그래서 메모리 낭비가 심하다. 이렇게 사용하는 일은 없다.대신 컬렉션 처리 (ArrayList등...)를
		//사용하면 단점을 보완할수 있다.
		for (Object o : obj2) {//for each문, 향상된 for문, 확장for문
			System.out.println(o);//오토언박싱
		}
	}

}
