package Lab2_Lab3_Lab4_Lab6;

import java.util.function.Supplier;

public class U0901WorkArray<T extends Number> {
    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    public static void main(String[] args) {

        executeSafe(() -> {
            throw new RuntimeException();
        });

        Long l = executeSafe(() -> 12220L + 130020200L);

        System.out.println(l);

        executeSafe(() -> {
            throw new ClassCastException();
        });

        String str = executeSafe(() -> "hello world");

        System.out.println(str);

        str = executeSafe(() -> "lol" + "kek");

        System.out.println(str);


    }

    double sum() {
        double doubleWork = 0;
        for (T x : arrNums) {
            doubleWork += x.doubleValue();
        }
        return doubleWork;
    }

    public static <T> T executeSafe(Supplier<T> x) {
        try {
            return x.get();
        } catch (Exception e) {
            //e.printStackTrace();
            return null;
        }
    }


}


