package Lab2_Lab3_Lab4_Lab6.sync;

public class U1901Bank {
    int intTo;
    int intFrom = 220;

    public synchronized void calc(int intTransaction, long lngTimeout) {
        System.out.println("[ Before ]\tThread: " + Thread.currentThread().getName() + "\tintFrom: " + intFrom + "\tintTo: " + intTo);
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        intTo += intTransaction;

        System.out.println("[ After ]\tThread: " + Thread.currentThread().getName() + "\tintFrom: " + intFrom + "\tintTo: " + intTo);
    }
}
