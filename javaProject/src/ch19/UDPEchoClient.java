package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT=3000;//������ ��Ʈ��ȣ ����
	public UDPEchoClient(String ip,int port) {
		try {
			InetAddress ia=InetAddress.getByName(ip);
			DatagramSocket ds=new DatagramSocket(port);
			System.out.println("���� ������ ������ message : ");
			file=new BufferedReader(new InputStreamReader(System.in));
			str=file.readLine();
			
			//��Ʈ��.getBytes(); : (��Ʈ�� ==> ����Ʈ�迭)
			//new String(����Ʈ �迭) :(����Ʈ�迭==>��Ʈ��)
			byte buffer[] =str.getBytes();
			//��Ʈ���� ����Ʈ�迭�� ��ȯ(UDP��ſ��� ����Ʈ�迭�� �����ؾ���)
			DatagramPacket dp=new DatagramPacket(buffer, buffer.length,ia,SERVERPORT);
			ds.send(dp);
			
			buffer=new byte[512];
			dp=new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);
			ds.close();
			System.out.println("server ip : "+dp.getAddress()+", server port : "+dp.getPort());
			System.out.println("�������� ���� �޼��� : "+new String(dp.getData()).trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPEchoClient("localhost", 2000);
	}
}
