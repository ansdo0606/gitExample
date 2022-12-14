package ch03;

public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++;//1의 값을 1 증가시킴(후위 연산자)
		System.out.println(i +"," + j);
		i = 5;
		j = ++i;//i의 값을 1증가시킴(전위 연산자)
		System.out.println(i + "," + j);
	}

}
