package ch10;


public class StaticVar2 {
	static int total;//static�޸𸮿����� �ٷ� �ε�=0
	String model;//heap ������ ������(nonstatic,new),(100����)�Ÿ,(200����)���,(300����)�ƹݶ�
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
	
}
