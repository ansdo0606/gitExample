package ch14;

public class Type2 {
	private Object value;
	public Object getValue() {//Object�� � �ڷ����̵� ó�� ����
		return value;
	}
	public void setValue(Object value) {
		this.value=value;
	}
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
	//��ó�� Object�� ���� ó���ϰ� �Ǹ� ���������� ����ȯ���� ó���� �������� �ȴ�.
	}
}
