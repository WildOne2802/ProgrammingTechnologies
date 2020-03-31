package FirstLab.Third;

public class Count {
    public static void main(String[] args) {
        int i = 0;
        long begin = new java.util.Date().getTime();
        while (i != 100_000_000) {
            i += 1;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end - begin);

        long i2 = 0;
        long begin2 = new java.util.Date().getTime();
        while (i2 != 100_000_000) {
            i2 += 1;
        }
        long end2 = new java.util.Date().getTime();

        System.out.println(end2-begin2);
    }
}
