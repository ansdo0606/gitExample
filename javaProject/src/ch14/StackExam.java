package ch14;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		//Stack���� : LIFO
		String[] nation = {"�ѱ�","�Ϻ�","�߱�","�̱�","����"};
		Stack<String> s =new Stack<>();
		for (String str : nation) {
			s.push(str);//���ؿ� �Է�
		}
		System.out.println(s.pop());//stack���� pop()���� ���
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());//�����Ͱ� ���̻� �������� ����
		
		while (!s.isEmpty()) {//������ ������� ������
			System.out.println(s.pop());
		}
	}
}
