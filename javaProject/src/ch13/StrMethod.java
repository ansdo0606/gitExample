package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";//str1=str1+"programming",문자열 연결이지만 실제로 
		//새로운 문자열이 만들고 str1은 새로운 문자열의 주소값을 가리키게 된다.
		System.out.println(str1);
		System.out.println(str1.length());
		String str2 = str1.concat(" programming");//concat()으로도 문자열 연결
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n번째 문자를 추출하고 싶을때는 
		System.out.println(str2.indexOf("program"));//"program"의 시작문자열인 p문자의 위치
		System.out.println(str2.indexOf("z"));//찾는 내용이 없으면 -1(z가 없으므로 -1 리턴)
		System.out.println(str2.substring(0, 4));//substring(start,end-1)=>(0~3)
		System.out.println(str2.substring(5));//5번부터 끝까지 호출
		System.out.println(str2.replace("java", "jsp"));//java=>jsp
		System.out.println(str2);
		
		String str3 = "3578945698712";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}
}
