package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<Ŭ���� ��ü> - <Object>��� ����� ���� Member��ü�� ���׸��ϸ�
		//Member������ ���̴� ��� �ڷ����� ���� �غ� ��������
		List<Member> list=new ArrayList<>();//�ǹ������� ������ ���׸� ����
		
		//���1)Member �ν��Ͻ� ���� �� setter�� Ȱ��
		Member m1=new Member();
		m1.setName("��ö��");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		//List�� Member �ν��Ͻ��� �߰�
		list.add(m1);//ArrayList�� Member��ü�� 1�� �߰�
		System.out.println(list.size());
		
		//���2)setter�� �Ⱦ��� ������
		Member m2 = new Member("hong","1234","ȫ�浿","02-222-3333","hong@nate.com");
		list.add(m2);//ArrayList�� Member��ü�� �� 1�� �߰�
		System.out.println(list.size());
		
		//���3) ���������� ���� ���ϰ� �ѹ��� �����͸� ����ϰ� ���Ŷ��
		list.add(new Member("choi","1234","��ö��","02-111-3333","choi@gmail.com"));
		System.out.println(list.size());
		
		System.out.println("�̸�\t���̵�\t���\t��ȭ\t�̸���");
		for (int i = 0; i < list.size(); i++) {
			Member m=list.get(i);//���⼭  m�� ArrayList�� �� �����͸� ����ų �ӽ� ���������� Ȱ��
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}
}
