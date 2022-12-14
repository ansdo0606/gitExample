package ch08;

class Circle{
	//¸â¹öº¯¼ö
	double radius;
	String color;
	public Circle(double r ,String c) {//r=10.0 c=»¡°­
		radius = r;
		color = c;
	}
	public Circle(double r){//r=5.0
		radius = r;
		color = "ÆÄ¶û";
	}
	public Circle(String c){//c=³ë¶û
		radius =21.0;
		color = c;
	}
	public Circle() {//r=3.5 c=»¡°­		±âº»»ý¼ºÀÚ
		radius = 3.5;
		color = "»¡°­";
	}
	//Ãâ·Â¿ëµµ
	public void print() {
		System.out.println("¹ÝÁö¸§ : "+radius);
		System.out.println("»ö±ò : "+color);
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0,"»¡°­");
		c1.print();
		
		Circle c2 = new Circle(5.0);
		c2.print();
		
		Circle c3 = new Circle("³ë¶û");
		c3.print();
		
		Circle c4 = new Circle();//±âº»»ý¼ºÀÚ È£Ãâ
		c4.print();
		
	}

}
