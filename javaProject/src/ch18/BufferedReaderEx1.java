package ch18;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//Buffered�迭(Reader �迭(Stream))���·� ����
		
		System.out.print("���ڿ� ������ �Է��ϼ��� : ");
		String line;
		try {
			line = br.readLine();//���ڿ� ������ �Է¹ޱ�
			System.out.println("�Է��� ���ڿ� : "+line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
