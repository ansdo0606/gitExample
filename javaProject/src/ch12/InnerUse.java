package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		//�������̽��� new �ؼ� ��ü������ �Ҽ� ����. => ������ ����Ŭ�������� ���·� �����Ҽ� �ִ�.
		Flyer f=new Flyer() {//new ������(){}; => ���� ���� Ŭ���� 
			
			@Override
			public void takeOff() {
				System.out.println("take off");
			}
			
			@Override
			public void land() {
				System.out.println("land");
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
			}
		};//���� ���� Ŭ����
		f.takeOff();
		f.fly();
		f.land();
		
	}
}
