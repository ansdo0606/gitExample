package ch16;

public class RunnableExam implements Runnable{
@Override
public void run() {
	for (int i = 1; i <= 100; i++) {
		System.out.println(Thread.currentThread().getName()+"==>"+i);
	}
}
public static void main(String[] args) {
	RunnableExam e1 = new RunnableExam();
	//Runnable�� ������ Thread�� ������ �����ؼ� ����Ѵ�.
	
	//new Thread(�����屸����ü,"�������̸�")
	Thread t1 = new Thread(e1,"thread1");
	Thread t2 = new Thread(e1,"thread2");
	
	t1.start();//run()�� ȣ���
	t2.start();
	
	
}
}
