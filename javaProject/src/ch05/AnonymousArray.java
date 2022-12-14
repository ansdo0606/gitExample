package ch05;

import ch04.Sum;

//무명배열 : 배열의 이름을 지정하지 않고 단순히 초기값만으로 배열을 생성
//무명배열은 즉시 배열을 만들어 함수의 인수로 전달할때 쓰며 배열이 딱 한번만 필요하고 
// 다시는 참조할일이 없을때 사용할수 없음.
public class AnonymousArray {

	public static void main(String[] args) {
		System.out.println("숫자들의 합 : "+ sum(new int[] {1,2,3,4}));
	}
	
public static int sum(int[] numbers) { //numbers[0]=1,numbers[1]=2,numbers[2]=3,numbers[3]=4
	int total=0;
	for (int i = 0; i < numbers.length; i++) {
		total = total+numbers[i]; //1+2+3+4
	}
	return total;
}
}
