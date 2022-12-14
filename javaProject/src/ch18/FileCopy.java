package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		//���纻<==(OutputStream��ü ���)[���α׷�] <==(InputStream��ü ���) ����
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		
		String file1="C:\\test\\aa.txt";//��������
		String file2="C:\\test\\b.txt";//���纻 ����
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str=reader.readLine();//�Ѷ����� ���� ex)aaa\r\n
				if (str==null) break;//������ ������ ����
				//������ ����Ҷ��� \r\n�� ���ֿ��� ��
				//\r carriage return(ĳ���� ����)
				//\n new line(�ٹٲ�)
				writer.write(str+"\r\n");
			
			}
			System.out.println("���Ϻ��簡 �Ϸ�Ǿ����ϴ�.");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if (reader != null) reader.close(); //���ҽ��� ���������� �ݾ��ִ°� ����.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (writer != null)writer.close(); //���۸� ���� ������ ������ �ȵ�
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
