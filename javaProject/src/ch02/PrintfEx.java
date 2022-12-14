package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s= "java";
		double f = 3.14;
		
		System.out.printf("%d\n", i);
		System.out.printf("%o\n", i);
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", d);
		System.out.printf("%-5d\n", d);
		System.out.printf("%05d\n", d);
		System.out.printf("%,d\n", d);//3자리마다 콤마 처리
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.println(String.format("54.1f", f));
		System.out.printf("%.1f\n", f);
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f);
		
		int a = 3, b = 5;
		//%를 표현 할때는 a%%b처럼 2개를 씀
		System.out.printf("a%%b=%d\n",a%b);
	}

}
