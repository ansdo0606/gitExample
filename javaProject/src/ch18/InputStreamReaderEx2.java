package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx2 {
	public static void main(String[] args) {
		int var = 0;
		//new InputStreamReader(InputStream)�̳� ����������
		Reader input =new InputStreamReader(System.in);
		System.out.println("�Է��ϼ��� : ");
		try {
			while (true) {
				var = input.read();//1���ڸ� �о���̴� ��
				if (var==13) break; 
				System.out.println(var+"==>"+(char)var);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
