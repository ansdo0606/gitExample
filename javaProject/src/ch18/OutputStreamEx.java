package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os = ps;//PrintStream ��ü�� �θ�Ÿ���� OutputStream ���� �޾�ó��
		//OutputStream�� 1byteó�� ��Ʈ�� (�ѱ� x)
		try {
			os.write(97);//a
			os.write(98);//b
			os.write(99);//c
			os.flush();//flush()�޼ҵ带 ��� ��±��� �ȴ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
