package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class UrlConnectionExam {
//프로그램 <==원격컴퓨터의 리소스(InputStream)
//프로그램 ==>원격컴퓨터의 리소스(OutputStream)
	//1.원격컴퓨터에 접속
	//2.스트림 생성
	//3.입출력 
	
	public static void main(String[] args) {
		URL url=null;
		try {
			url = new URL("http://google.com");
			HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();
			if (conn != null) {//접속 되었으면
				//서버에서 일정시간 응답이 없으면 연결을 종료시킴
				conn.setConnectTimeout(3000);//타임아웃 시간 설정
				StringBuilder sb=new StringBuilder();
				//정상적으로 처리된 경우
				if (conn.getResponseCode()==HttpsURLConnection.HTTP_OK) {
					//스트림을 사용해서 html source code를 읽어옴
					BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
					while (true) {
						String line = br.readLine();//한 라인을 읽음
						if (line==null) break;
						sb.append(line+"\r\n");//줄바꿈 문자 추가	
						
					}
					br.close();//버퍼 닫기
				}
				conn.disconnect();//http연결 종료
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
