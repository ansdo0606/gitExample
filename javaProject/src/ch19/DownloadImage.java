package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website="https://postfiles.pstatic.net/MjAyMjEyMDdfOTIg/MDAxNjcwMzg2Mjc3ODM5.QRDATvJZwTyv8ysYcPNVzMjBVTZHL64JijBQ7yedZx4g.InTDmxIO4EmDRCBIO7Qx959OhLV1HoRyamUuvFZA7kgg.JPEG.balahk/BF45AC13-7A66-40E1-B280-59C58784DA59.jpg?type=w773";
		System.out.println("�ٿ�ε带 �����մϴ�.");
		URL url = new URL(website);
		//byte�迭
		byte[] buffer=new byte[2048];//���ۿ� ����Ʈ �迭[2mb]
		//������ ����<==���α׷�<==������ �̹��� ����
		//try~with��(java 1.7���� ����)
		//finally�� ��� ���ҽ��� �ڵ����� �����Ŵ
		//try(���ҽ� �����){
		//}catch(Exception e){
		//}
		try(InputStream in=url.openStream();OutputStream out=new FileOutputStream("c:\\test\\test.jpg")) {
			int length=0;//length ���� ����Ʈ�� ����
			//���̻� ���� ������ ������ -1
			while ((length=in.read(buffer)) != -1) {//���� ������ ������
				System.out.println(length+"����Ʈ ����.");
				out.write(buffer,0,length);
				
			}
			System.out.println("�ٿ�ε尡 �Ϸ�Ǿ����ϴ�.");
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
