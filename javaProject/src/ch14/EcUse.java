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
		Map<String, Object> map = new HashMap<>();//맵 인스턴스 생성
		List<EC> list = new ArrayList<>();//리스트 인스턴스 생성
		list.add(new EC(1234,"2022-08-24","하이트맥주","삼성","37918****68",55900));
		list.add(new EC(2345,"2022-09-11","꼬깔콘","롯데","35691****45",23600));
		list.add(new EC(3456,"2022-10-29","노트북","현대","36160****82",2600000));
		map.put("list",	list);//맵에 리스트 추가
	
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("------------------------------------------------------------------------------");
		print(map);
		System.out.println("------------------------------------------------------------------------------");
	}

}
