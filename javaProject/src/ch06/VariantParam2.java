package ch06;

public class VariantParam2 {
	
	static void print(String ... n) {
		for (int i= 0; i < n.length; i++) {
				System.out.println("���� : " + n[i]);
	}
		System.out.println("----------------");
	}
static void print(int ... n) {
	int tot = 0;
	for (int i = 0; i < n.length; i++) {
		System.out.println("���� : " +n[i]);
		tot = tot+n[i];
	}
	System.out.println("���� : " + tot);
	System.out.println("��� : " +String.format("%.1f", (double)tot/n.length) );
}


	
	
	
	public static void main(String[] args) {
		System.out.println("===��ݱ� ����===");
		print("Java","DB");
		print(99,88);
		System.out.println();
		System.out.println("===�Ϲݱ� ����===");
		print("HTML","JSP","Spring");
		print(95,86,75);
	}

}
