package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고자 하는 단을 입력하세요 : ");
		int dan = 2;
		int j = 1; 
		
		dan=sc.nextInt();
		
		while (j<=9) {
			System.out.println(dan+" X "+j+" = "+ (dan*j));
			j++;
	}

}
}
