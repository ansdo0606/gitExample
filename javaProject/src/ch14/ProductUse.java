package ch14;

import java.util.ArrayList;
import java.util.List;

public class ProductUse {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		System.out.println("2���� ��ǰ������ �Է��ϼ���.");
		Product p1 = new Product();
		p1.input();
		Product p2 = new Product();
		p2.input();
		
		list.add(p1);
		list.add(p2);
		
		System.out.println("                                         (����:õ��)");
		System.out.println("---------------------------------------------------------");
		System.out.println("��ǰ��ȣ\t��ǰ��\t������\t�ܰ�\t����\t�ݾ�");
		for (int i = 0; i < list.size(); i++) {
			Product b = list.get(i);
			System.out.println(b.getNum()+"\t"+b.getName()+"\t"+b.getCompany()+"\t"
			+b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
 		}
		System.out.println("---------------------------------------------------------");
	}

}
