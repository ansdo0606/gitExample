package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {

	static void print(Map<String, Object> map) {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		for (EC e : list2) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+
		"\t"+e.getProduct()+"\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"+e.getPay());
		}
	}
		
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//�� �ν��Ͻ� ����
		List<EC> list = new ArrayList<>();//����Ʈ �ν��Ͻ� ����
		list.add(new EC(1234,"2022-08-24","����Ʈ����","�Ｚ","37918****68",55900));
		list.add(new EC(2345,"2022-09-11","������","�Ե�","35691****45",23600));
		list.add(new EC(3456,"2022-10-29","��Ʈ��","����","36160****82",2600000));
		map.put("list",	list);//�ʿ� ����Ʈ �߰�
	
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("�ֹ���ȣ\t�ֹ�����\t\t�ֹ���ǰ\tī���\tī���ȣ\t\t�����ݾ�");
		System.out.println("------------------------------------------------------------------------------");
		print(map);
		System.out.println("------------------------------------------------------------------------------");
	}

}
