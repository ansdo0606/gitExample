package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		//List : ������� ����, Map : ������ ����
		//Map<key, value>
		/*Map<String, String> map = new HashMap<>();
		map.put("�ѱ�", "����");//��.put(key,value)
		System.out.println(map.get("�ѱ�"));//��.get(key)
		map.put("�Ϻ�", "����");
		map.put("�߱�", "�ϰ�");
		map.put("�̱�", "������");
		map.put("�±�", "����");
		map.put("����", "����");
		System.out.println(map);
		String nation ="����";
		System.out.println(nation+"�� ������ "+map.get(nation));
		//Iterator ; �ݺ�ó���� ���� ���밴ü(for���� ������ ���)
		Iterator <String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {//������Ұ� ������
			String key =(String)iterator.next();//�������
			System.out.print("key="+key);
			System.out.println(",value="+map.get(key));
			
		}*/
		//ArrayList�� ó���ϸ�
		List<String> nations = new ArrayList<>();
		nations.add("����");
		nations.add("�ѱ�");
		nations.add("�߱�");
		nations.add("�̱�");
		nations.add("�Ϻ�");
		List<String> city =new ArrayList<>();
		city.add("����");
		city.add("����");
		city.add("�ϰ�");
		city.add("������");
		city.add("����");
		
		String nation ="����";
		for (int i = 0; i < nations.size(); i++) {
			if (nations.get(i).equals(nation)) {
				System.out.println();
			}
		}
	}
}
