package ch03;

public class StringExam {

	public static void main(String[] args) {
		String str = "Hello" + "java";// ���ڿ��� ����(���� ������)
		System.out.println(str);
		str = 123 + "C";//���� + ���ڿ�
		System.out.println(str);
		
		str += "Programmer";//str + str+"Programmer"
		System.out.println(str);
	}

}
