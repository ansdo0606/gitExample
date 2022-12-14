package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str = null;
		try {//r:�б�����,w:��������,rw:�б�,����
			RandomAccessFile file = new RandomAccessFile("c:\\test\\rand.txt", "rw");
			//getFilePointer : ���� ������(������ ������ �о����� ����Ŵ)
			System.out.println(file.getFilePointer());//0
			file.seek(8);//8��° �ε�������
			System.out.println(file.getFilePointer());//8
			file.write("HTML".getBytes());//�ε��� 8�� ��ġ���� �⺻������ ����� �ȴ�.
			System.out.println(file.length());//���ڱ��� Ȯ��(�ѱ��� 3����Ʈ ���̰��� ����)
			System.out.println(file.getFilePointer());
			while (file.getFilePointer() < file.length()) {
				//������ ���뺸�� ���� �������� ��ġ���� ������ �ݺ�
				str=file.readLine();
				//new String(���ڿ�,ĳ���ͼ�) ���ڵ� ��� ��ȯ�Ҷ� ���
				//�ѱ�ó��
				//String.getBytes() - ��Ʈ���� ����Ʈ �迭�� ��ȯ
				//8859_1,iso-8859_1 : ��������� ���ڵ� ���
				//ms949 : 2����Ʈ
				//utf-8 : 3����Ʈ- �ʼ� 1byte,�߼�1byte,����1byte
				str=new String(str.getBytes("8859_1"),"utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//���� ���� ����
			System.out.println("������ ����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
