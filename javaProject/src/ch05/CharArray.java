package ch05;

public class CharArray {

	public static void main(String[] args) {
		//char[] ch = {'j','a','v','a'};
		//���Ĺ������� ǥ���ϼ���
	char[] ch;//�迭��������
	ch = new char[4]; //�迭������ ���ÿ� �迭�� ����ó��
	ch[0] ='j';
	ch[1] ='a';
	ch[2] ='v';
	ch[3] ='a';
	
		
		//�迭��������.length => �迭�� ������
		for (int i = 0; i < ch.length; i++) {
			System.out.println(i+"��° ���� : "+ch[i]);
			
		
		}
	}

}
