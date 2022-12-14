package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {
	public static void main(String[] args) {
		OutputStream os = null;
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		try {
			os = new FileOutputStream("C:\\test\\abc.txt");
			System.out.println("�Է��ϼ���  : ");
			while (true) {
				int ch = System.in.read();
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���������� �����߽��ϴ�.");
			e.printStackTrace();
		}
		
		
		String file1="C:\\test\\abc.txt";
		String file2="C:\\test\\abcCopy.txt";
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while (true) {
				str=reader.readLine();
				if (str==null) break;
				writer.write(str+"\r\n");
			
			}
			System.out.println("���Ϻ��簡 �Ϸ�Ǿ����ϴ�.");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				if (reader != null) reader.close(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (writer != null)writer.close(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
