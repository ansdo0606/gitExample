package ch04;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer://Labeló��
			while (true) {
				System.out.println("(1) square(����)");
				System.out.println("(2) square root(������)");
				System.out.println("(3) log(�α�)");
				System.out.print("���ϴ� �޴� (1~3)�� �����ϼ���.(����:0) >");
				String tmp = scanner.next();
				menu = Integer.parseInt(tmp);
				if (menu==0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else if (menu <1 || menu > 3 ) {
					System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
					continue;
				}
				for (;;) {//for�� �� ���ѷ���
					System.out.print("����� ���� �Է��ϼ���.(��� ����:0 ,��ü����:99) >");
					tmp = scanner.next();
					num = Integer.parseInt(tmp);
					if (num ==0) {
						break;//��� ����, for���� ���
					}
					if (num==99) {
						break outer;//��ü����. for���� while���� ��� ���
					}
					switch (menu) {
					case 1:
						System.out.println("result="+num*num);//����
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));//����
						break;
					case 3:
						System.out.println("result="+Math.log(num));//����
						break;
					}//switch case
				}//end for(;;)
			}//end while
		System.out.println("���α׷��� ��� �����մϴ�.");
	}//end main
}//end class
