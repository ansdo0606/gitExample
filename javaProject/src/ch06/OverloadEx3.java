package ch06;


public class OverloadEx3 {

	public static void main(String[] args) {
		print("ȫ�浿","hong@gmail.com","010-1234-5678");
		print("�̼���",99,87,76);
		print("�����",560);
	}

	 static void print(String name,int kor,int eng, int mat) {
		System.out.println("=============================================");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)
				+"\t"+String.format("%.1f",  (double)(kor+eng+mat)/3));
	}

	 static void print(String name,String email,String hp) {
		System.out.println("=============================================");
		System.out.println("�̸�\t�̸���\t\t��ȭ");
		System.out.println(name+"\t"+email+"\t"+hp);
	}
	static void print(String name,int salary) {
		System.out.println("=============================================");
		System.out.println("�̸�\t�޿�\t����\t�Ǽ��ɾ�");
		System.out.println(name+"\t"+salary+"\t"+(int)(salary*0.03)+"\t"+(int)(salary-(salary*0.03)));
	}
}
