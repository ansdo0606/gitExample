package ch13;
//�޸� ���� ����
public class Replace {

	public static void main(String[] args) {
		String a = "java program"; //�����ð��� �޸𸮰� ������ �ٴ�,�Ŀ� �������÷��Ͱ� ������
		System.out.println(a.replace("a", "A")); //1ȸ������ �Ѱ� �� ����Ǵ°��� �ƴϴ�
		System.out.println(a); //String�� �Һ���
		a = a.replace("a", "A");//���� �ʱ�ȭ
		System.out.println(a);
	}

}
