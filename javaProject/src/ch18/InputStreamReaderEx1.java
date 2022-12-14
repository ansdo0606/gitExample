package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
	//InputStream : 1����Ʈ ������ ����
	//InputStreamReader : ���ڴ��� (2byte)�� ����
	public static void main(String[] args) {
		InputStream is = System.in;//1����Ʈ
		//new ~ Reader(Stream)
		InputStreamReader isr = new InputStreamReader(is);//2����Ʈ
		System.out.println("�ѱ��ڸ� �Է��ϼ��� : ");
		try {
			int code = isr.read();
			System.out.println("code : "+code);
			char ch = (char)code;
			System.out.println("char : "+code);
		} catch (IOException e) {
			e.printStackTrace();
		}//������ �ڵ尪
	}
}
