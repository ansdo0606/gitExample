package ch11;

public abstract class AbstractClass {//하나라도 abstract 메소드가 있으면 클래스도 abstract해야한다.
	
	abstract void method();
	void method2() {//일반 메소드
		System.out.println("완성된 method");
	}
}
