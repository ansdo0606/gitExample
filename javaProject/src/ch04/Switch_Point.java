package ch04;

public class Switch_Point {

	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		int tot = kor+eng+mat;
		double avg = tot / 3.0;
		String grade = "";
		switch ((int)(avg / 10 )) { //double�� int�� ��������ȯ
		case 10:
		case 9: grade = "��"; break;
		case 8: grade = "��"; break;
		case 7: grade = "��"; break;
		case 6: grade = "��"; break;
		default : grade = "��";
			
			
			
		}
			System.out.println("����\t����\t����\t����\t���\t���");	
			System.out.printf("%d\t%d\t%d\t%d\t%3.1f\t%s",kor,eng,mat,tot,avg,grade);
	}

}
