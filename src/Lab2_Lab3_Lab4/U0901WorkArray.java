package Lab2_Lab3_Lab4;

public class U0901WorkArray<T extends Number>  {
    T[] arrNums;

    U0901WorkArray(T[] numP) {
        arrNums = numP;
    }

    double sum() {
        double doubleWork = 0;
        for (T x : arrNums) {
            doubleWork += x.doubleValue();
        }
        return doubleWork;
    }
    //TODO:
    //static method "execute_safe" takes lambda any type
    //catch exception
    //return null if exception


}


