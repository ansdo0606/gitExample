package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
	public static void main(String[] args) throws Exception{
		Socket socket=null;
		PrintWriter writer=null;
		BufferedReader reader=null;
		try {
			//new Socket("������ ip�ּ�",��Ʈ��ȣ)
			socket=new Socket("127.0.0.1",5555);
			writer=new PrintWriter(socket.getOutputStream(),true);
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		String receive="";
		String send;
		Scanner sc=new Scanner(System.in);
		while (true) {
			receive=reader.readLine();//�޼��� ����
			System.out.println("[server]"+receive);
			if (receive.equals("quit")) break;
			System.out.println("Ŭ���̾�Ʈ�� �Է��ϼ���(����:quit) : ");
			send=sc.nextLine();//Ű����� �Է�
			if (send.equals("quit")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			if (send != null) {
				writer.println(send);//�޼��� ������
			}
			
		}
		//���ҽ� ����
		sc.close();
		writer.close();
		reader.close();
		socket.close();
	}
}
