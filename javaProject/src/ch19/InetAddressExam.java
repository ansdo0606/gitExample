package ch19;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try {//��Ʈ��ũ ���α׷��� �ʼ� try~catch �����
			InetAddress address=InetAddress.getByName("google.com");
			System.out.println(address);//ȣ��Ʈ �̸�,ip�ּҰ�
			System.out.println(address.getHostName());//ȣ��Ʈ �̸�(������ �̸�)
			System.out.println(address.getHostAddress());//ip�ּҰ�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
