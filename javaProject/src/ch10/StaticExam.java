package ch10;

//�������� ���� ����ҋ� =>nonstatic ex)�л���
//�������� ���� ����Ҷ� =>static ex)���� 4.0�̻�, 3.5�̻� ��
public class StaticExam {
 public static void main(String[] args) {
	int a =40,b=30,result;
	//��ǥ������ ���� ����ϰ� �����Ȱ���,Math Ŭ��������  static,final�� ���� ����Ѵ�.
	result = Math.max(a, b);//���� ū��
	System.out.println(result);
	
	result = Math.min(a, b);//���� ���� ��
	System.out.println(result);
	System.out.println(Math.sqrt(100));
	
	double r = 15.3;
	System.out.println("���� �ѷ� : "+2*Math.PI*r);
	System.out.println("���� ���� : "+Math.PI*r*r);
}
}
