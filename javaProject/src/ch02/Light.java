package ch02;

public class Light {

	public static void main(String[] args) {
		//long = 8����Ʈ (64��Ʈ) ������ ����
		long lightspeed;
		long distance;
		
		lightspeed = 300000L;//L,l�� ��������
		distance = lightspeed * 365L * 24 * 60 * 60;
		//���� 1�⵿�� ���� �Ÿ� = ���� �ӵ� * 365�� * 24�� * 60�� * 60��
		System.out.println("���� 1�� ���� ���� �Ÿ� :"+ distance + "km");
	}

}
