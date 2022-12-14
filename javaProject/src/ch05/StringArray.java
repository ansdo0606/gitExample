package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","HTML"};
		//정식문법으로 바꿔보세요
		
		  /* String[] str;
		  str = new String[4];
		  str[0] = "Java";
		  str[1] = "DB";
		  str[2] = "JSP";
		  str[3] = "HTML";		*/  
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	
		//확장for문(향상된 for문, for~each문) => jdk1.5부터 사용가능
		//for(개별값 저장 변수 : 집합변수){ }
		for(String a : str) {
			System.out.println(a);
		}
}
}