package ch18;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
//��Ʈ��(Stream) : �������� ������ ���
//~Stream ��ü���� 1byte������ ��Ʈ�� ó���ϸ�, ��� ��������,����,Ư�����ڸ� ó���Ҽ� �ִ�.(�ѱ�ó�� �Ұ�)
//InputStream(�Է½�Ʈ��)
//OutputStream(��½�Ʈ��)
	public static void main(String[] args) {
		//���α׷� <= Ű����
		InputStream is =System.in;//��ǥ������ System.in�� InputStream�̴�.
		System.out.print("���ڸ� �Է��ϼ��� : ");
		try {//�����,��Ʈ��ũ,DB�� �ʼ��� ����ó��
			int code = is.read();//Ű����� ���� 1byte�� ����.�ѱ�(2byte)�� ó���� �ȵ�.
			System.out.println(code);
			char ch = (char)code;//��� ���ڿ��� ������ �����ڵ尡 �ִ�.
			//���� int�� �Ǵ� code�� char������ ����ȯ�ؼ� �ڵ尪�� ���ڰ����� ������ �ִ�.
			System.out.println("char : "+code);
		} catch (IOException e) {//����� ���� ����ó��
			e.printStackTrace();
		}
	}
}
