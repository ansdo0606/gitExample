package ch19;

import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		//서버소캣 : 서버에서 서비스를 위한 목적으로 만드는 소캣
		ServerSocket socket = null;
		//포트번호 : 0~65535 내에서 배정이 가능하고 중복되지 않아야 함
		//1port 1service
		//well known port number(자주사용하는 포트번호)
		//80:웹서비스,21:FTP서비스,445:파일공유,3389:원격접수,8080:오라클DB 기본포트
		
		for (int i = 0; i < 65535; i++) {
			try {
				socket = new ServerSocket(i);//서버소캣 생성
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
				//사용중인 포트는 피해서 사용해야한다.
				e.printStackTrace();
			}
		}
		System.out.println("포트검사를 마쳤습니다.");
	}
}
