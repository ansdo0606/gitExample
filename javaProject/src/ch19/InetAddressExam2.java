package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam2 {
	public static void main(String[] args) {
		//getAllByName(url)==>�������� ip�ּҸ� �迭�� ����
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
