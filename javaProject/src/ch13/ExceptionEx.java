package ch13;

public class ExceptionEx {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		try {
			for (int i = 0; i <= 5; i++) {//i <= 5�������� ������ ������ �ƴϴ�
				System.out.println(nums[i]);
			}
			
		} catch (Exception e) {
			System.out.println("���α׷� ���� �߿� ������ �߻��߽��ϴ�.");
		}
	System.out.println("���α׷� ����...");
	}
}
