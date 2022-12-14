package ch18;
//Stream : �������� ������ ���,����Ʈ ����
//���α׷� ===> �ܺ��ڿ� : ��½�Ʈ��
//���α׷� <=== �ܺ��ڿ� : �Է½�Ʈ��

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemberUse {
	public static void main(String[] args) {
		FileOutputStream fos=null;	//��������
		ObjectOutputStream oos=null;//�޸𸮿� �ִ� ��ü�� ���Ϸ� ����
		MemberDTO m1=new MemberDTO("kim","��浿","1234",30,"kim@gmail.com");
		MemberDTO m2=new MemberDTO("lee","�̱浿","1234",20,"lee@gmail.com");
		MemberDTO m3=new MemberDTO("park","�ڱ浿","1234",40,"park@gmail.com");
		try {
			fos = new FileOutputStream("c:\\test\\object.dat");
			//����ȭ() : �޸�=>���α׷�=>����
			oos= new ObjectOutputStream(fos);
			oos.writeObject(m1);//m1��ü�� ���Ͽ� ����
			oos.writeObject(m2);//m2��ü�� ���Ͽ� ����
			oos.writeObject(m3);//m3��ü�� ���Ͽ� ����
			System.out.println("��ü�� ���Ϸ� �����߽��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//������ȭ(deserialization):����=>���α׷�=>�޸�
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:\\test\\object.dat");
			ois = new ObjectInputStream(fis);
			MemberDTO dto1=(MemberDTO)ois.readObject();
			MemberDTO dto2=(MemberDTO)ois.readObject();
			MemberDTO dto3=(MemberDTO)ois.readObject();
			
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
