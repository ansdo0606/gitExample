package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws Exception{
		//Socket("ip�ּ�",��Ʈ��ȣ)
		Socket s=new Socket("localhost",8000);
		//�������� accept()�ϸ� ����� ������ ���°� ��
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//�������� ���� �޼����� ����
		String res=input.readLine();
		System.out.println(res);
		s.close();//��Ĺ�ݱ�
		System.exit(0);//���α׷� ����
	}
}
