package ch06;


public class OverloadEx2 {

	public static void main(String[] args) {
		int i1 = 3,i2 = 7,i3 = 10;
		double d1 = 7.0, d2 =3.0;
		
		System.out.printf("max(%d,%d) = %d\n",i1,i2,max(i1,i2));
		System.out.printf("max(%.1f,%.1f) = %.1f\n",d1,d2,max(d1,d2));
		System.out.printf("max(%d,%d,%d) = %d\n",i1,i2,i3,max(i1,i2,i3));
	}
	private static int max(int n1, int n2) { //n1=3,n2=7 //n1=7,n2=10
		int result = n1 > n2 ? n1 : n2; //false
		return result; //7 return
	}
	private static double max(double n1, double n2) { //n1 =7.0, n2=3.0
		double result = n1 > n2 ? n1:n2; //true 
		return result; //7.0 return
	}
	private static int max(int n1, int n2, int n3) { //n1=3,n2=7,n3=10
		return max(max(n1, n2),n3); // max(7,n3) false /10 return
	}

	
}
