package ch12;

interface Member{
	void num();
	void name();
	void email();
}

public class MemberAnony {
	public static void main(String[] args) {
		Member m = new Member() {
			
			@Override
			public void num() {
				System.out.println("����ȣ : 2");
			}
			
			@Override
			public void name() {
				System.out.println("�̸� : ��浿");
			}
			
			@Override
			public void email() {
				System.out.println("�̸��� : kim@gmail.com");
			}
		};
		System.out.println("----------------------------------");
		m.num();
		m.name();
		m.email();
		System.out.println("----------------------------------");
	}
}
