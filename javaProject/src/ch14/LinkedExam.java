package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//ť ���� : FIFO(First In First Out)
		String[] fruits = {"���","��","����","����","����"};
		LinkedList<String> list = new LinkedList<>();
		for (String str : fruits) {
			list.offer(str);
		}
		String str="";
		while ((str=(String)list.poll())!= null) {//poll()�ڷ� ������
			System.out.println(str+"�����Ǿ����ϴ�.");
		}
	}
}
