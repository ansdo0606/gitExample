package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();
		List<ProdEx> list=new ArrayList<>();
		list.add(new ProdEx("TV", "oled01", "LG", 300, 10));
		list.add(new ProdEx("�����", "s02re", "�Ｚ", 200, 5));
		list.add(new ProdEx("������", "win03", "���Ͼ�", 100, 8));
		list.add(new ProdEx("��ǻ��", "asus09", "�Ƽ���", 200, 6));
		
		map.put("list", list);//�ʿ� ����Ʈ �߰�
		print(map);
	}

	static void print(Map<String, Object> map) {
		ArrayList<ProdEx> list2=(ArrayList<ProdEx>)map.get("list");
		System.out.println("��ǰ��\t��ǰ��ȣ\t������\t�ܰ�\t����\t�Ǹűݾ�");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()
			+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
	}
}
