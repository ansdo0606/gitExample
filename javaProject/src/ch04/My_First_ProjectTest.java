package ch04;
import java.util.Scanner;
public class My_First_ProjectTest {

	public static void main(String[] args) {
		int menu=0,num=0;
		Scanner scan = new Scanner(System.in);
		
		outer ://��ó��
		while(true) {
			System.out.println("== [ �޴� ]  ==");
			System.out.println("(1) �ѽ�");
			System.out.println("(2) ���");
			System.out.println("(3) �߽�");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(���� : 0) >");
			String tmp = scan.next();
			menu = Integer.parseInt(tmp);//���ڿ��� ���ڿ��� ��ȯ
			if(menu == 0 ) {
				System.out.println("���α׷��� �����մϴ�.");
				break;	
			}else if(menu < 1 | menu > 3) {
				System.out.println("�߸� �����ϼ̽��ϴ�(����:0)");
				continue;
			}
			if(menu==1) {
				for(;;) {//for(;;)�� ���ѹݺ� ����
					System.out.println("[�ѽĸ޴�]");
					System.out.println("(1) ��ġ�");
					System.out.println("(2) �����");
					System.out.println("(3) ����");
					System.out.println("(4) �����");
					System.out.println("�ѽ� �޴��� �����ϼ���. (�ѽ� �޴� ���� ����:0, ��ü����:99)");
					tmp = scan.next();
					num = Integer.parseInt(tmp);
					if(num==0) break;//��� ���� for ���� ���
					if(num==99) break outer;//��ü ���� for���� while�� ��� ���
					switch(num) {
					case 1:
						System.out.println("������ ��ġ��� �����ϼ˽��ϴ�.");
						break;
					case 2:
						System.out.println("������ ������� �����ϼ˽��ϴ�.");
						break;
					case 3:
						System.out.println("������ ������ �����ϼ˽��ϴ�.");
						break;
					case 4:
						System.out.println("������ ������� �����ϼ˽��ϴ�.");
						break;
					}//switch~case
				}//end for(;;)
			}//end if
			else if(menu==2) {
				for(;;) {//for(;;)�� ���ѹݺ� ����
					System.out.println("[��ĸ޴�]");
					System.out.println("(1) ���");
					System.out.println("(2) ����������ũ");
					System.out.println("(3) ī�����̽�");
					System.out.println("��� �޴��� �����ϼ���. (��� �޴� ���� ����:0, ��ü����:99)");
					tmp = scan.next();
					num = Integer.parseInt(tmp);
					if(num==0) break;//��� ���� for ���� ���
					if(num==99) break outer;//��ü ���� for���� while�� ��� ���
					switch(num) {
					case 1:
						System.out.println("������ ����� �����ϼ˽��ϴ�.");
						break;
					case 2:
						System.out.println("������ ����������ũ�� �����ϼ˽��ϴ�.");
						break;
					case 3:
						System.out.println("������ ī�����̽��� �����ϼ˽��ϴ�.");
						break;
						}//switch~case
				}//end for(;;)
			}//end if
			else if(menu==3) {
				for(;;) {//for(;;)�� ���ѹݺ� ����
					System.out.println("[�߽ĸ޴�]");
					System.out.println("(1) ¥���");
					System.out.println("(2) «��");
					System.out.println("(3) ������");
					System.out.println("�߽� �޴��� �����ϼ���. (�߽� �޴� ���� ����:0, ��ü����:99)");
					tmp = scan.next();
					num = Integer.parseInt(tmp);
					if(num==0) break;//��� ���� for ���� ���
					if(num==99) break outer;//��ü ���� for���� while�� ��� ���
					switch(num) {
					case 1:
						System.out.println("������ ¥����� �����ϼ˽��ϴ�.");
						break;
					case 2:
						System.out.println("������ «���� �����ϼ˽��ϴ�.");
						break;
					case 3:
						System.out.println("������ �������� �����ϼ˽��ϴ�.");
						break;
					}//switch~case
				}//end for(;;)
			}//end if
		System.out.println("���α׷���  ���� �մϴ�.");
		}
		System.out.println("���α׷��� ��� �����մϴ�.");//end while
	}//end main
}

