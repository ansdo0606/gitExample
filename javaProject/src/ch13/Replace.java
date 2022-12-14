package ch13;
//메모리 낭비가 심함
public class Replace {

	public static void main(String[] args) {
		String a = "java program"; //일정시간은 메모리가 떠돌아 다님,후에 가비지컬렉터가 정리함
		System.out.println(a.replace("a", "A")); //1회성으로 한것 뿐 저장되는것은 아니다
		System.out.println(a); //String의 불변성
		a = a.replace("a", "A");//변수 초기화
		System.out.println(a);
	}

}
