package ch10;

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("�ﰢ�� �׸���...");
	}
}

class Rectangle extends Figure {
	@Override
	void draw() {
		System.out.println("�簢�� �׸���...");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("�� �׸���...");
	}
}

public class Figure {
	void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.draw();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
		
		System.out.println("=======������ ���=========");
		Figure f=new Triangle();//�º��� �θ�, �캯�� �ڽ� => ���������
		f.draw();
		f=new Rectangle();
		f.draw();
		f=new Circle();
		f.draw();
		
		
		


	}

}
