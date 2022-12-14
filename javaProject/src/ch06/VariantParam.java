package ch06;

public class VariantParam {

	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","JSP");
		print("java","program","JSP","big","data");
	}
	
	static void print(String ...n) { //n이 가변형 매개변수(배열처리의 주소값)이 됨
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	
	/*static void print(String a) {
		
	}
	static void print(String a,String b) {
		
	}
	static void print(String a,String b,String c) {
		
	}
	static void print(String a,String b,String c,String d,String e) {
	
}*/
}
