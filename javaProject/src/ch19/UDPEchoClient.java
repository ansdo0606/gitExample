package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT=3000;//서버측 포트번호 셋팅
	public UDPEchoClient(String ip,int port) {
		try {
			InetAddress ia=InetAddress.getByName(ip);
			DatagramSocket ds=new DatagramSocket(port);
			System.out.println("서버 측에서 보내는 message : ");
			file=new BufferedReader(new InputStreamReader(System.in));
			str=file.readLine();
			
			//스트링.getBytes(); : (스트링 ==> 바이트배열)
			//new String(바이트 배열) :(바이트배열==>스트링)
			byte buffer[] =str.getBytes();
			//스트링을 바이트배열로 변환(UDP통신에선 바이트배열을 전송해야함)
			DatagramPacket dp=new DatagramPacket(buffer, buffer.length,ia,SERVERPORT);
			ds.send(dp);
			
			buffer=new byte[512];
			dp=new DatagramPacket(buffer, buffer.length);
			ds.receive(dp);
			ds.close();
			System.out.println("server ip : "+dp.getAddress()+", server port : "+dp.getPort());
			System.out.println("서버에서 보낸 메세지 : "+new String(dp.getData()).trim());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPEchoClient("localhost", 2000);
	}
}
