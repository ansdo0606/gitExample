package ch06;

public class VariantParam {

	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","JSP");
		print("java","program","JSP","big","data");
	}
	
	static void print(String ...n) { //n�� ������ �Ű�����(�迭ó���� �ּҰ�)�� ��
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
