package ch07;

import ch06.ModiEx;

public class ModiExUse extends ModiEx {
	//상속관계를 자세히 다룰 예정
	//상속관계에 있어서 부모 클래스가 아닌 자식 클래스를 인스턴스화 해야한다.

	public static void main(String[] args) {
		ModiExUse me = new ModiExUse();
		System.out.println(me.name);
		
	}

}
