package ch16;

public class MusicBoxExam {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();//MusicBox �ν��Ͻ� ����
		
		MusicPlayer kim = new MusicPlayer(1, box);//MusicPlayer �ν��Ͻ� ����(�Ű������� �ִ� ������ ���)
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		//MusicPlayer ������ ����
		kim.start();
		lee.start();
		park.start();
	}
}
