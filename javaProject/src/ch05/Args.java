package ch05;

public class Args {

	//�Է��� �Ű��������� �迭�� �����, args�� ��������
	//����� �Ű�����
	//��Ŭ���� ���� -Run -Run Configurations - Arguments �ǿ��� one two �Է�..����
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i+"��° �Ű����� : "+args[i]);
		}
	}

}
