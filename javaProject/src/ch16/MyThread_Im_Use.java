package ch16;

public class MyThread_Im_Use {
    public static void main(String[] args) {
        MyThread_Im m1 = new MyThread_Im();
        Thread t1 = new Thread(m1, "������1");
        Thread t2 = new Thread(m1, "������2");
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        
        t2.start();
        t1.start();

    }

}
