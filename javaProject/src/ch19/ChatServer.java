package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket=null;
		try {
			//���񽺸� ���� ��Ʈ ����
			serverSocket=new ServerSocket(5555);//5555 �� ��Ʈ����
			System.out.println("���񽺰� ���۵Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���񽺸� ������ �� �����ϴ�.");
			System.exit(1);//���������� ����
			Socket clientSocket=null;
			try {
				//Ŭ���̾�Ʈ�� ������ ��ٸ��ٰ� �����ϸ� ��Ĺ ����
				clientSocket=serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ�� ip : "+clientSocket.getInetAddress().getHostAddress());
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			//�߽ſ� ��Ʈ��
			PrintWriter writer=new PrintWriter(clientSocket.getOutputStream(),true);
			
			//���ſ� ��Ʈ��
			BufferedReader reader=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String receive="";
			String send="Wellcomed!!!";
			
			writer.println(send);//�޼��� ������
			Scanner sc=new Scanner(System.in);
			while (true) {
				receive=reader.readLine();//�� ������ ����
				if (receive == null || receive.equals("quit")) {//��������
					break;
				}
				System.out.println("[client]"+receive);
				System.out.println("������ �Է��ϼ���.(����:quit) :");
				send=sc.nextLine();
				writer.println(send);//�޼��� ������
				if (send.equals("quit")) break; 
					
				
			}
			//���ҽ� ����
			sc.close();
			writer.close();
			reader.close();
			clientSocket.close();
			serverSocket.close();
		}
	}
}
