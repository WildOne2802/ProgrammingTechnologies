package Lab2_Lab3_Lab4_Lab6.sync;

public class U1901Thread extends Thread {
    U1901Bank bankWork;
    int intTrans;
    long lngSleep;

    U1901Thread(U1901Bank bankWork, int intTrans, long lngSleep) {
        this.bankWork = bankWork;
        this.intTrans = intTrans;
        this.lngSleep = lngSleep;
    }

    public void run() {
        bankWork.calc(intTrans, lngSleep);
//        bankWork.calc2(intTrans, lngSleep);
    }

}
