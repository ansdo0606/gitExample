package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio radioB = new Radio();
		radioB.channel = 89.1;
		radioB.volume = 12;
		radioB.onoff = true;
		System.out.println("[브리츠 라디오]");
		radioB.print();
		
		System.out.println();
		
		Radio radioI = new Radio();
		radioI.channel = 95.1;
		radioI.volume = 9;
		radioI.onoff = false;
		System.out.println("[아이리버 라디오]");
		radioI.print();

 }
}
