package ch03;

public class InCrease {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		j = i++;//1�� ���� 1 ������Ŵ(���� ������)
		System.out.println(i +"," + j);
		i = 5;
		j = ++i;//i�� ���� 1������Ŵ(���� ������)
		System.out.println(i + "," + j);
	}

}
