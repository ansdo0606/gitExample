package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class UrlConnectionExam {
//���α׷� <==������ǻ���� ���ҽ�(InputStream)
//���α׷� ==>������ǻ���� ���ҽ�(OutputStream)
	//1.������ǻ�Ϳ� ����
	//2.��Ʈ�� ����
	//3.����� 
	
	public static void main(String[] args) {
		URL url=null;
		try {
			url = new URL("http://google.com");
			HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();
			if (conn != null) {//���� �Ǿ�����
				//�������� �����ð� ������ ������ ������ �����Ŵ
				conn.setConnectTimeout(3000);//Ÿ�Ӿƿ� �ð� ����
				StringBuilder sb=new StringBuilder();
				//���������� ó���� ���
				if (conn.getResponseCode()==HttpsURLConnection.HTTP_OK) {
					//��Ʈ���� ����ؼ� html source code�� �о��
					BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
					while (true) {
						String line = br.readLine();//�� ������ ����
						if (line==null) break;
						sb.append(line+"\r\n");//�ٹٲ� ���� �߰�	
						
					}
					br.close();//���� �ݱ�
				}
				conn.disconnect();//http���� ����
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
