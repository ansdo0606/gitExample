package ch19;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlInfo {
	//URL : url������ �м��ϴ� Ŭ����
	public static void main(String[] args) {
		try {
			URL url = new URL("https://newsstand.naver.com/?list=&pcode=326");
			System.out.println("�������� : "+url.getProtocol());
			System.out.println("��Ʈ : "+url.getPort());
			System.out.println("ȣ��Ʈ : "+url.getHost());
			System.out.println("���� : "+url.getFile());
			System.out.println("��Ÿ : "+url.toExternalForm());
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
