package SecondLab;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        GenericItem[] Array = new GenericItem[4];
        Array[0] =
                new FoodItem(1, "Bread", 30.0f, Category.FOOD, new Date(2020, 3, 3), (short) 3);
        Array[1] =
                new TechnicalItem(2, "PC", 60000.0f, null, Category.GENERAL, (short) 365);
        Array[2] =
                new FoodItem(3, "Butter", 60.0f,     Category.FOOD, new Date(2020, 3, 3), (short) 7);
        Array[3] =
                new TechnicalItem(4, "Printer", 5000.0f, null, Category.GENERAL, (short) 120);

        for (GenericItem item : Array) {
            item.printAll();
            System.out.println();
        }
        FoodItem a = new FoodItem(1, "Bread", 30.0f, Category.FOOD, new Date(2020, 3, 3), (short) 3);
        System.out.println(Array[0].equals(Array[2]));
        System.out.println(Array[0].equals(a));
    }
}

