package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
	public static void main(String[] args) {
		Integer arr[] = {3,29,46,15,89,-20};
		System.out.println("�迭 ������ : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		//�������� ����
		System.out.println("�������� ���� : ");
		Arrays.sort(arr);//sort()�� �������� ������ ����
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		
		//�������� ����
		System.out.println("�������� ���� : ");
		Arrays.sort(arr,Collections.reverseOrder());//Collections.reverseOrder()�� �������� ������ ����
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
