package ch14;

public class Type3<T> {//�ڷ����� ������ ����<�ƹ����ڳ�>
	T t;//������ �ڷ��� ����
	public void setT(T t) {//�޼ҵ嵵 �ڷ��� ����
		this.t = t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		//�ν��Ͻ��� ������ �� �ڷ����� ������.=>���ʸ�(�Ϲ�ȭ)�̶� ��.
		Type3<String> t=new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2=new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>();
		t3.setT(100.1);
		System.out.println(t3.getT());
		
	}
}
