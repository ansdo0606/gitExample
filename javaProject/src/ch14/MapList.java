package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2=(ArrayList<Student>)map.get("list");//map������ key�� �����͸� �ҷ���
		for (Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+
					"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//�� �ν��Ͻ� ����
		List<Student> list = new ArrayList<>();//����Ʈ �ν��Ͻ� ����
		list.add(new Student("201801","kim","����",1,"park"));//����Ʈ�� Student �߰�
		list.add(new Student("201902","choi","����",3,"hong"));
		list.add(new Student("201801","lee","����",2,"min"));
		map.put("list",	list);//�ʿ� ����Ʈ �߰�
	
		print(map);//��������ó�� list�ȿ� 3���� ��ü�� map�� ����� print���� �Ű�����ȭ�Ǿ� �ѱ�
		
	}
}
