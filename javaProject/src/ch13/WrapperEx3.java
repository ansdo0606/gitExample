package ch13;

public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data = {'H','e','l','l','o','1','2','3','4'};
		System.out.println("-----------------------------------------------");
		System.out.println("(Character 사용)");
		for (int i = 0; i < data.length; i++) {
			if (Character.isUpperCase(data[i])) {//대문자면 true
				System.out.println(data[i]+"==>대문자");
			}else if (Character.isLowerCase(data[i])) {//소문자면 true
				System.out.println(data[i]+"==>소문자");
			}else if (Character.isDigit(data[i])) {
				System.out.println(data[i]+"==> 숫자");
			}else {
				System.out.println(data[i]+"==>기타문자");
			}
		}
		System.out.println();
		System.out.println("(Integer 사용)");
		System.out.println("문자 "+Integer.toString(1234)+"입니다.");//정수를 문자열로 변환
		System.out.println("숫자 "+Integer.parseInt("1234")+"입니다.");//문자열 "200"을 10진수로 변환
		System.out.println("숫자 1234+2 = "+(Integer.parseInt("1234")+2)+"입니다.");//
		System.out.println("-----------------------------------------------");
	}
}
