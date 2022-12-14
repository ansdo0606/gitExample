package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		//arr은 배열참조변수
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		if (arr != null) { //arr이 주소번지가  null, 즉 주소값이 없는게  아니면 (주소값이 있으면)
		 for (int i = 0; i <10; i++) {
			System.out.println(arr[i] +",");
		}	
		}
	}

}
