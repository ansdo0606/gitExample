package ch09;

public class SportsCarTest {

	public static void main(String[] args) {
		SportsCar obj = new SportsCar();//�ڽ� Ŭ������ �ν��Ͻ�ȭ
		obj.speed = 10;//speed�� car��� �θ�Ŭ���� �ɹ�
		//SportsCar ��ü�� Car ��ü�� ��ӹ޾ұ� ������ �θ���� Car��ü�� �����(�������,����޼ҵ�)��
		//��� ����Ҽ� ����
		//�θ𲨴� ����
		
		obj.setSpeed(60);
		obj.setTurbo(true);
		
	}

}
