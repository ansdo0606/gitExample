package ch03;

public class CastEx {
//�ڷ�����ȯ(�߿�)
	public static void main(String[] args) {
		float f = 1.6f;//float��ŭ�� �ڿ� f�� ������� �Ѵ�. 4����Ʈ�� ����
		System.out.println(f);
		
		f = 100;//�ڵ�����ȯ(����100�� �ڵ����� float�� �Ǽ� 100.0f�� ��ȯ
		System.out.println(f);
		
		f = 100.5F;
	/*	int i = f;//���� Ÿ�Կ� �Ǽ� f�� ������ �Ұ��� �ϱ� ������ ������ ��*/
		int i = (int)f;//���� ����ȯ
		System.out.println(i);//�� �ս��� ���� �� �ִ�.
		
		
		
	}

}
