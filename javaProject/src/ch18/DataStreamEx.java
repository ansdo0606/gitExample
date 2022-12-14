package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			//�ؽ�Ʈ ������ �ƴ� binary file(��������)�� ����
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream("c:\\test\\test.dat"));
			dataout.writeInt(123);//���������� �ڷḦ ���Ͽ� ����
			dataout.writeChar('A');//���� ������ �ڷḦ ���Ͽ� ����
			dataout.writeDouble(3.5);//�Ǽ� ������ ...
			dataout.close();//��Ʈ�� �ݱ�(������ ������)
			System.out.println("����Ǿ����ϴ�.");
			
			//���������� �б�
			DataInputStream datain=new DataInputStream(new FileInputStream("c:\\test\\test.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
