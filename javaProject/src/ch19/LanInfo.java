package ch19;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class LanInfo {
	public static void main(String[] args) {
		try {
			//NetworkInterface : ��ī�� ����
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			//getNetworkInterfaces() :��Ʈ��ũ �������̽��� �پ��� ���� ����
			while(enu.hasMoreElements()) {//���� ��Ұ� ������ true
				NetworkInterface net=enu.nextElement();
				System.out.println(net);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
