package ch15;

public class ThrowExam {
	//throw : ���ܸ� ���� �߻���Ŵ, �׽�Ʈ��ܿ��� ���� ������ ����.
	static void test(int n) {
		if (n==0) {
			//throw new ����ó�� Ŭ����() => Ư���� ���ǿ� ���������� ���ܸ� �߻���Ŵ
			throw new NullPointerException();
		}
	}
	
	public static void main(String[] args) {
		test(0);
	}
}
