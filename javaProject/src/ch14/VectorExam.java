package ch14;

import java.util.Vector;

//�÷���(Collection)-�迭�� ������ ������ Ŭ������
//�迭�� ���� - ������ ������ �ȵ�. ����,������ �����. �پ��� �ڷ����� �����Ҽ� ����.
//Map�迭 - ������ �������� ������ Ű�� ������(�ε����� ���� Ű�� ��ȭ)
//List �迭 - ������� ����, Ű�� ����(�ε����� ��ȭ)
//Vector ��� ������ ArrayLixt�� ���� ����.
public class VectorExam {
	public static void main(String[] args) {
		//Vector v = new Vector(); ������ �ƴ����� �Ʒ�ó�� ó���ϴ°� ����.
		Vector<Object> v = new Vector();
		//��� �ڷ��� ó�� ����
		//����� �ڵ����� �þ
		System.out.println("�ʱ������ : "+v.capacity());//10���� ������� �⺻���� �Ѵ�.
		v.add("first");//add("�߰��� �ڷ�")
		v.add(2);
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		
		System.out.println("�߰� ������ : "+v.capacity());//�Էµ� �����Ͱ� ���Ͱ� ����� ����
		//�ʱ� 10���� ����� �Ѿ�� �� 10���� ����� �߰��� �����.
		System.out.println("�������� ���� : "+v.size());//����.������
		//����� �迭�� length�� ����.
		
		System.out.println("�ʱ� ������ ");
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+"\t");//������ : �迭[i]ó�� ���� �ȵȴ�.
		}
		System.out.println();
		//v.remove(0);//������ �ε��� 0�� ��� ����
		v.add(6, 102);//������ �ε��� 6���ڸ��� ������ �߰�
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		
		
	}
}
