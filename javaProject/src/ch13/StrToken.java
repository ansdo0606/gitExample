package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str = "kim,20,180,55,����,�л�";
		String[] items = str.split(",");//�޸��� �������� �����͸� �и�
		for (String s : items) {
			System.out.println(s);
		}
		StringTokenizer st = new StringTokenizer(str,",");
		int cnt = st.countTokens();//��ū�� ����
		System.out.println("��ū�� ���� : "+cnt);
		
		while (st.hasMoreElements()) {//���� ��ū�� ���������� �ݺ�
			System.out.println(st.nextToken());//��ū�ϳ��� ������ ����
		}
	}
}
