package ch12;


public class MemberOuter {
	//�������
		private int num = 1;//TestOuter�� �������
		private String name ="ȫ�浿";
		private String email = "hong@gmail.com";
		class MemberInner {//��ø Ŭ����
			void msg() {//Inner�� ��� �޼ҵ�
				System.out.println("-----------------------------");
				System.out.println("����ȣ : "+ num);
				System.out.println("�̸� : "+ name);
				System.out.println("�̸��� : "+email);
				System.out.println("-----------------------------");
				//��øŬ���������� �ܺ�Ŭ������ private ��������� ���� �ִ�.
			}
		}//end inner class
		public static void main(String[] args) {
			MemberOuter m =new MemberOuter();//1)�ܺΰ�ü ����
			MemberOuter.MemberInner in = m.new MemberInner();//2)���ΰ�ü ����
			in.msg();
		}
}
