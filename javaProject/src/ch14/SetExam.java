package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//Set�� �ߺ����� ������� ����
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");//�ߺ����� ó������ �ʴ´�
		System.out.println(hs);
		for (String str : hs) {
			System.out.println(str);
		}
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {//���� ��Ұ� ������ true
			System.out.println(it.next());//���� ��Ҹ� ����
			
		}
	}
}
