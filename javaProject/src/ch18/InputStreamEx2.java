package ch18;

import java.io.IOException;

public class InputStreamEx2 {
	public static void main(String[] args) {
		int var = 0;//�Է¹޴� ���ڸ� ���ڷ� �޾Ƽ� ó���ϱ� ���� ����
		System.out.print("������ �Է��ϼ��� : ");
		try {
			var = System.in.read();
			while (var != 13) {//����Ű�� �Է��Ҷ� ���� �ݺ�
				System.out.println(var+"==>"+(char)var);
				var=System.in.read();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
