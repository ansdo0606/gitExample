package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
//���α׷� ==> ����(��½�Ʈ���� �ʿ�)
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");
			System.out.println("�Է��ϼ���  : ");
			while (true) {
				int ch = System.in.read();
				if(ch==13) break;
				os.write(ch);
			}
			System.out.println("����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println("���������� �����߽��ϴ�.");
			e.printStackTrace();
		}
	}
}
