package ch05;

//3���� �迭 : �迭 = new �ڷ��� [��][��][��]
public class Array3Dim {

	public static void main(String[] args) {
		//2�� 3�� 4��
		String[][][] subject = {
				//1��
				{{"JS01","AL02","PY03","DS04"},//�����ڵ�
				{"JSP","�˰���","���̽�","�ڷᱸ��"},//�����
				{"ȫ�浿","������","�̿���","���ʼ�"}},//��������
				//2��
				{{"CS01","CS02","CS03","CS04"},//�����ڵ�
				{"��Ȱ����","������","��Ȱü��","����"},//�����
				{"�迭ö","������","�ֹ��","������"}}};//��������
		//subject [0][0][0]=JS01
		
		for (int i = 0; i < subject.length; i++) { //��
			for (int j = 0; j < subject[i].length; j++) {//��
				for (int k = 0; k < subject[i][j].length; k++) {//��
					System.out.println("["+i+"]["+j+"]["+k+"] : " + subject[i][j][k]);
				}
			}
			System.out.println("===============================================");
		}
	}

}
