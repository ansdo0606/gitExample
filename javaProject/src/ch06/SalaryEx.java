package ch06;
//�޿���� ���α׷�
public class SalaryEx {
//��������(�������) ���� �� �ʱ�ȭ
	static String[] name = {"�ڰ���","�����","�̴븮","������","ȫ����"};
	static int[] salary = {2000,3000,2500,2000,3500};//����
	static int[] bonus = {0,0,0,0,0};//���ʽ�
	static int[] total = new int[5];//�Ѿ�(����+���ʽ�)
	static int[] tax  = new int[5];//����
	static int[] pay = new int[5];//�Ǽ��ɾ�
	static int pay_tot;//�����޾�
	
	//�޿����
	static void calc() {
		for (int i = 0; i < name.length; i++) {
			bonus[i] = (int)(salary[i]*0.3);//������ 30%
			total[i] = salary[i] + bonus[i];//�Ѿ�(����+���ʽ�)
			tax[i] = (int)(total[i]*0.03);//����(�Ѿ��� 3%)
			pay[i] = total[i]-tax[i];//�Ǽ��ɾ�(�Ѿ�-����)
			pay_tot = pay_tot + pay[i];//�����Ѿ�
		}
	}
	//��¿뵵�� �޼ҵ�
	static void print() {
		System.out.println(""
				+ "�̸�\t����\t���ʽ�\t�Ѿ�\t����\t�Ǽ��ɾ�");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+
					"\t"+tax[i]+"\t"+pay[i]);
		}
		System.out.println("�����ݾ�(�Ǽ���) �հ� : "+ pay_tot);
		System.out.println("�����޾� ��� : "+ pay_tot/name.length);
	}
	public static void main(String[] args) {
		calc();
		print();
	}

}
