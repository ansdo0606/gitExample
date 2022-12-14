package ch04;

public class Star {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}//inner for
			System.out.println();//ÁÙ¹Ù²Þ
		}//outer for
		//¿ª»ï°¢Çü
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}