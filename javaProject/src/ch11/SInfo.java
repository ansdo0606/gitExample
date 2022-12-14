package ch11;

public class SInfo implements Student {
	
	
	int kor, eng, mat, tot;
	double avg;
	
	public SInfo() {
		this(90, 85, 70);
	}
	
	public SInfo(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
		
	
	@Override
	public void address() {
		System.out.println("=================================================");
		System.out.println("�̸�\t�ּ�\t\t�̸���");
		System.out.println(NAME +"\t"+ ADRESS +"\t"+ EMAIL);
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void point() {
		tot = kor + eng + mat;
		avg = tot/3.0;
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(NAME +"\t"+ kor +"\t"+ eng +"\t"+ mat +"\t"+ tot +"\t"+
							String.format("%.1f", avg));
		System.out.println("=================================================");
	
	}

}
