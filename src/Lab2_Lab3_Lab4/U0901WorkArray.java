package Lab2_Lab3_Lab4;

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

        Long l = (Long) executeSafe(() -> 12220L+130020200L);

        System.out.println(l);

        String str = executeSafe(() -> "hello world").toString();

        System.out.println(str);


    }

    double sum() {
        double doubleWork = 0;
        for (T x : arrNums) {
            doubleWork += x.doubleValue();
        }
        return doubleWork;
    }

    public static Object executeSafe(Supplier<Object> x) {
        try {
            return x.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //TODO:
    //static method "execute_safe" takes lambda any type
    //catch exception
    //return null if exception


}


