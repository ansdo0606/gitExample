package ch04;

public class If_Else_Ex2 {

	public static void main(String[] args) {
		int kor =85;
		int mat =90;
		int eng = 70;
		int tot = kor+eng+mat; //����
		double avg = tot /3.0; //���
		String grade = ""; //���(��,��,��,��,��)
		if (avg >= 90 ) {
			grade = "��";
		}else if(avg >=80 ) {
			grade = "��";
		}else if(avg >=70 ) {
			grade = "��";
		}else if(avg >=60 ) {
			grade = "��";
		}else {
			grade = "��";
		}
		System.out.println("����\t����\t����\t����\t���\t���");
		//System.out.println(kor+ "\t" + eng + "\t"+mat+"\t"+tot+"\t"+avg+"\t"+grade);
		
		System.out.printf("%d\t%d\t%d\t%d\t%.1f\t%s",kor,eng,mat,tot,avg,grade);
	}

}
