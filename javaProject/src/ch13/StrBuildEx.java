package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a");
		String str2 = " Java Programmer";
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("append()�޼ҵ带 Ȱ�� : " +str1.append(str2));
		System.out.println("replace()�޼ҵ带 Ȱ�� : "+str1.replace(7, 11, "JSP"));
		System.out.println("substring()�� Ȱ�� : "+str1.substring(7));
		System.out.println("--------------------------------------------------");
	}
}
