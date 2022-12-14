package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os = ps;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����ó�� ����
		try {
			bw.write("ȯ���մϴ�.\n");
			bw.write("Java");
			bw.newLine();//����ó���� ���ִ� �޼ҵ�
			bw.write("world!!");
			bw.flush();//���ۿ� �����ִ� ��� ����Ʈ�� ���
			bw.close();//��ĳ��ó�� �������ִ°͵� ����.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
