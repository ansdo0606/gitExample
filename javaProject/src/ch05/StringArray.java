package ch05;

public class StringArray {

	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","HTML"};
		//���Ĺ������� �ٲ㺸����
		
		  /* String[] str;
		  str = new String[4];
		  str[0] = "Java";
		  str[1] = "DB";
		  str[2] = "JSP";
		  str[3] = "HTML";		*/  
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	
		//Ȯ��for��(���� for��, for~each��) => jdk1.5���� ��밡��
		//for(������ ���� ���� : ���պ���){ }
		for(String a : str) {
			System.out.println(a);
		}
}
}