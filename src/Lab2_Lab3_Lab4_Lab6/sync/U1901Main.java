package Lab2_Lab3_Lab4_Lab6.sync;

public class U1901Main {
    public static void main(String[] args) {
        func();
    }


    public static void func() {

        Object obj = new Object();
        synchronized (obj) {
            U1901Bank bankMain = new U1901Bank();
            U1901Thread threadOne = new U1901Thread(bankMain, 100, 2000);
            threadOne.setName("FirstThread1");
            threadOne.setPriority(Thread.MAX_PRIORITY);
            threadOne.start();

            U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300);
            threadTwo.setName("SecondThread1");
            threadTwo.setPriority(Thread.MAX_PRIORITY);
            threadTwo.start();

            U1901Bank bankMain2 = new U1901Bank();
            U1901Thread threadOne2 = new U1901Thread(bankMain2, 100, 2000);
            threadOne2.setName("FirstThread2");
            threadOne2.setPriority(Thread.MAX_PRIORITY);
            threadOne2.start();

            U1901Thread threadTwo2 = new U1901Thread(bankMain2, 50, 300);
            threadTwo2.setName("SecondThread2");
            threadTwo2.setPriority(Thread.MAX_PRIORITY);
            threadTwo2.start();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

//TODO:
// synchronize method and synchronize block check documentation
