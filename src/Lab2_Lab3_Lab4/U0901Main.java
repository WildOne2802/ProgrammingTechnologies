package Lab2_Lab3_Lab4;

public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        Float[] floatArr = new Float[5];

        int maxValue = 100;
        int minValue = 0;
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = minValue + (float) (Math.random() * maxValue);
        }
//        for (int i = 0; i < floatArr.length; i++) {
//            System.out.println(floatArr[i]);
//        }

        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);

        System.out.println("Float sum: " + insWorkArrayFloat.sum());
        System.out.println("Integer sum: " + insWorkArrayInt.sum());

//        U0901WorkArray<String> insWorkArrayStr = new U0901WorkArray<String>();
    }
}
