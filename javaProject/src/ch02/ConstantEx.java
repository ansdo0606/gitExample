package ch02;

public class ConstantEx {

	public static void main(String[] args) {
		//final�� �ٿ� ������ ���ó��
		final double KM_PER_MILE = 1.609344;//��� : ������ �ʴ� ��ó��,
		//����� �̸��� �빮�ڷ� ǥ���ϱ⸦ �ǰ�
		double km;
		double mile = 60.0;
		km = KM_PER_MILE * mile;
		System.out.println("60������ " +km+"ų�ι��� �Դϴ�.");
	}

}
