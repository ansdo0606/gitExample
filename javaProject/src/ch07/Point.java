package ch07;

//������� c;ass version
public class Point {
	private String name; 
	private int kor; 
	private int eng; 
	private int mat; 
	private int tot; 
	private double avg; 
	private String grade; 
//getter,setter:���콺 ��Ŭ�� ->Source->Generate Getter and Setter->Select All
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor+eng+mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot/3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		if (avg >= 90) {
			grade = "��";
		}else if (avg >= 80) {
			grade = "��";
		}else if (avg >= 70) {
			grade = "��";
		}else if (avg >= 60) {
			grade = "��";
		}else {
			grade = "��";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void print() {
		System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+getTot()+"\t"+
		String.format("%.1f", getAvg())+"\t"+getGrade());
	}	
	
}
