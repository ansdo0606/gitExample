package ch06;

public class EchoEx {

	public static void main(String[] args) {
		echo("�ȳ�!",3);
	}

	public static void echo(String s, int n) { //s=�ȳ�! ,n =3
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}
	}

}
