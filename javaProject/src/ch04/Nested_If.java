package ch04;
//��ø
import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ �Է��ϼ��� : ");
		a = sc.nextInt();
		System.out.print("������ �� ������ �Է��ϼ��� : ");
		b = sc.nextInt();
		sc.close();
		
		if (a>b) {
			if ((a%2)==0) {
				System.out.println(a+"��(��)"+b+"���� ū ¦��");
				
			} else {
				System.out.println(a+"��(��)"+b+"���� ū Ȧ��");
			}
		}else {
			if ((a%2)==0) {
				System.out.println(a+"��(��)"+b+"���� ���� ¦��");
			}else {
				System.out.println(a+"��(��)"+b+"���� ���� Ȧ��");
			}
		}
	}

}
