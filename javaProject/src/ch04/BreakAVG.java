package ch04;

import java.awt.TexturePaint;
import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			int num = scanner.nextInt();
			if (num<0) //-값을 입력해야 종료(ex-1)
				break;//if문 안이 한줄짜리면 {} 생략 가능
			total += num;//total =total+num
			count++;
		}
		System.out.println("평균은 "+ total/count);
		scanner.close();
	}

}
