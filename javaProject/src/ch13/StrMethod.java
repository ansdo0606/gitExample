package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " programming";//str1=str1+"programming",���ڿ� ���������� ������ 
		//���ο� ���ڿ��� ����� str1�� ���ο� ���ڿ��� �ּҰ��� ����Ű�� �ȴ�.
		System.out.println(str1);
		System.out.println(str1.length());
		String str2 = str1.concat(" programming");//concat()���ε� ���ڿ� ����
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n��° ���ڸ� �����ϰ� �������� 
		System.out.println(str2.indexOf("program"));//"program"�� ���۹��ڿ��� p������ ��ġ
		System.out.println(str2.indexOf("z"));//ã�� ������ ������ -1(z�� �����Ƿ� -1 ����)
		System.out.println(str2.substring(0, 4));//substring(start,end-1)=>(0~3)
		System.out.println(str2.substring(5));//5������ ������ ȣ��
		System.out.println(str2.replace("java", "jsp"));//java=>jsp
		System.out.println(str2);
		
		String str3 = "3578945698712";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}
}
