package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeExam {
	//url���� �ѱ�,Ư�����ڰ� ���Եɼ� ����
	//url encoding(���ڵ�)==>�ѱ�,Ư�����ڸ� url�������� ��ȯ��Ŵ
	//url decoding(���ڵ�)==>���ڵ��� ���ڿ��� ó�� �������� ������Ŵ
	public static void main(String[] args) {
		try {
			String str="��ö��";
			//System.out.println(URLEncoder.encode(str,"utf-8"));
			System.out.println(URLDecoder.decode("%EA%B9%80%EC%B2%A0%EC%88%98","utf-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
