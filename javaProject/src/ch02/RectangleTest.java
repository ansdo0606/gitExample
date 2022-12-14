package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		int x = in.nextInt();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		int y = in.nextInt();
		System.out.printf("직사각형의 넓이는 %d입니다.\n", x*y);
		in.close();
		
	}

}
