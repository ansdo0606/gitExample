package ch05;

public class ForeachEx {
	//enum�� �迭���� ������ ������� ���� �����͸� �����ؼ� ���⸸ �ϸ� �ȴ�.
	enum Week {��,ȭ,��,��,��,��,��}
	
	public static void main(String[] args) {
		int [] n= {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		int sum = 0;
		for (int k : n) {
			System.out.print(k+ " "); //�ݺ��Ǵ� k�� ���
			sum += k;
		}
		System.out.println("���� : "+ sum);
		
		for (String s : names) {
			System.out.println(s+" ");
			
		}
		System.out.println();
		
		for (Week day : Week.values()) { //���պ���ó���� ��ü�̸�.values()
			System.out.println(day +"����");
		}
	}

}
