package ch18;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStreamWriterEx {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		OutputStream os=ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);//2����Ʈ ó��
		//OutputStreamWriter(OutputStream)ó��
		try {
			osw.write(44032);//��
			osw.write("���ٶ�");
			osw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
