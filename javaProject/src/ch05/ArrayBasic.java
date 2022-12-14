package ch05;
//배열
public class ArrayBasic {

	public static void main(String[] args) {
		/*int[] score = new int[5]; => 한줄로 처리 가능
		int[] score = {100,90,80,60,70}; 실무기법*/
		
		int[] score; //배열참조변수 선언
		score = new int[5]; //new를 통해서 메모리에 5개의 int형
		
		//배열생성(4byte x 5 = 20byte) 가성비 떨어짐 메모리 커서
		System.out.println(score); //score는 메모리의 주소값을 가리키는 참조변수가 된다.
		score[0]=100;
		score[1]=90;
		score[2]=80;
		score[3]=60;
		score[4]=70;
		//score[5]=90; 갯수가 맞아야 하며 0부터 시작함을 항상 기억해야됨
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		//System.out.println(score[5]); 에러가 남
		
		/*for (int i = 0; i < 5; i++) {
			System.out.println(score[i]); 위의 식 다른 표현방식*/
		}
	}


