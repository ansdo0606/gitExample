package ch09;

class Bank{
	double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	@Override
	double getInterestRate() {//�޼ҵ� �������̵�(������)
		return 10;
	}
}
class NormalBank extends Bank{
	@Override
	double getInterestRate() {//�޼ҵ� �������̵�(������)
		return 5.0;
	}
}
class GoodBank extends Bank{
	@Override
	double getInterestRate() {//�޼ҵ� �������̵�(������)
		return 3.0;
	}
}
public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();//��ü����,�ν��Ͻ�ȭ
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank�� ������ : "+b1.getInterestRate());
		System.out.println("NormalBank�� ������ : "+b2.getInterestRate());
		System.out.println("GoodBank�� ������ : "+b3.getInterestRate());
		
	}

}
