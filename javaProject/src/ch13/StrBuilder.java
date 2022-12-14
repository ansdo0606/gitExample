package ch13;

public class StrBuilder {
	public static void main(String[] args) {
		//StringBuffer str = new StringBuffer();
		StringBuilder str1 = new StringBuilder();//�ֽŹ���
		str1.append("java");//���ڿ� ���� �߰�, �޸� ����
		System.out.println(str1.toString());
		str1.append(" programming");
		System.out.println(str1);
		str1.replace(0, 4, "jsp");//0~3 �ε��� ������ ����(java->jsp)
		//�ʰ�� replace()�޼ҵ�� �ַ� String��ü��  replace()�� ���� ���� ���̴�.
		System.out.println(str1);
		String str2 = str1.substring(3);//�ε��� 3���� ������
		System.out.println(str1);
		System.out.println(str2);
		
		//StringBuilder�� String���� �ٲܶ��� toString()�� ���(�߿�)
		String str3 = str1.toString();
		//String str3 = str1; ����
		System.out.println("StringBuilder(str1)->String(str3)�� ���� : "+str3);
		//str1=str3; ����
		//String�� StringBuilder�� �����Ҷ�
		str1 = new StringBuilder(str3);
		System.out.println("StringBuilder -> String�� ���� "+str1);
	}
}
