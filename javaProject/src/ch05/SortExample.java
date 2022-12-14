package ch05;

import java.util.Arrays;
import java.util.Collections;


public class SortExample {

	public static void main(String[] args) {
		int[] num = {29,1,81,70,13,92,36};
		Arrays.sort(num); //�⺻������ �������� ������ ���ش�.
		for (int i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
        System.out.println();

        //���������� Ư����  Integer��� Wrapper ClassŸ������ ������ó���� �Ǿ���ϰ�
        //Collections.reverseOrder()��� �޼ҵ带 �Ἥ ó���ؾ��Ѵ�.
        Integer rev[]= {29,1,81,70,13,92,36};
        Arrays.sort(rev,Collections.reverseOrder());
        for (int i  : rev) {
			System.out.print(i+" ");
		}
	}

}
