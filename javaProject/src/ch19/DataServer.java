package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//������ ���α׷�(���� ����)
public class DataServer {
	public static void main(String[] args) throws Exception{
		//try~with��
		try(ServerSocket ss = new ServerSocket(8000)){
			System.out.println("���񽺰� ���۵Ǿ����ϴ�.");
			while (true) {
				//Clent Socket
				//Ŭ���̾�Ʈ���� �����ϸ� ��Ĺ����(������ ȸ�� ����)
				Socket socket=ss.accept();
				PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� mm�� dd�� hh�� mm�� ss��");
				String str=sdf.format(new Date());//�ý��� ��¥
				out.println(true);//Ŭ���̾�Ʈ���� ������ ����
				socket.close();//��������
			}
		}
	}
}
