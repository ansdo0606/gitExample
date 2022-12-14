package ch08;

//�̱��� ���
public class MyManager {
	private int score;//10, 100
	
	private MyManager(int score){
		this.score=score;
	}
	
	private static MyManager mgr;
	
	public static MyManager getInstance() {
		if(mgr==null) {//ó�� MyManager�� ��üȭ �ɶ�
			mgr=new MyManager(10);
		}
		return mgr;//�ѹ��̻� ��ü �����Ǿ��ٸ�(��,�ּҰ��� ������) �װ��� ����
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}

}
