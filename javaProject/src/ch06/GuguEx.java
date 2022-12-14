package ch06;

public class GuguEx {

	public static void gugu(int dan) {
		System.out.println("==="+dan+"´Ü===");
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"x"+i+"="+(dan*i));
		}
	}
	
	public static void guguAll() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("==="+i+"´Ü===");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	public static void main(String[] args) {
		gugu(3);
		gugu(5);
		
		for (int i = 2; i < args.length; i++) {
			gugu(1);
		}
		guguAll();
	}
}
