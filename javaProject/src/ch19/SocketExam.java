package ch19;

import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		//������Ĺ : �������� ���񽺸� ���� �������� ����� ��Ĺ
		ServerSocket socket = null;
		//��Ʈ��ȣ : 0~65535 ������ ������ �����ϰ� �ߺ����� �ʾƾ� ��
		//1port 1service
		//well known port number(���ֻ���ϴ� ��Ʈ��ȣ)
		//80:������,21:FTP����,445:���ϰ���,3389:��������,8080:����ŬDB �⺻��Ʈ
		
		for (int i = 0; i < 65535; i++) {
			try {
				socket = new ServerSocket(i);//������Ĺ ����
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"�� ��Ʈ�� ������Դϴ�.");
				//������� ��Ʈ�� ���ؼ� ����ؾ��Ѵ�.
				e.printStackTrace();
			}
		}
		System.out.println("��Ʈ�˻縦 ���ƽ��ϴ�.");
	}
}
