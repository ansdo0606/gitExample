package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
;

public class BufferedReaderEx2 {
	public static void main(String[] args) {
		//Buffered�迭(Reader �迭(Stream))���·� ����
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ� ������ �Է��ϼ��� : ");
		try {
			String str = reader.readLine();
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[���α׷� ����]");
	}
}
