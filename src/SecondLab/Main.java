package SecondLab;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        GenericItem[] Array = new GenericItem[4];
        Array[0] =
                new FoodItem(1, "Bread", 30.0f, null, Category.FOOD, new Date(2020, 3, 3), (short) 3);
        Array[1] =
                new TechnicalItem(2, "PC", 60000.0f, null, Category.GENERAL, (short) 365);
        Array[2] =
                new FoodItem(3, "Butter", 60.0f, null, Category.FOOD, new Date(2020, 3, 3), (short) 7);
        Array[3] =
                new TechnicalItem(4, "Printer", 5000.0f, null, Category.GENERAL, (short) 120);

        for (GenericItem item : Array) {
            item.printAll();
            System.out.println();
        }

        FoodItem a = new FoodItem(1, "Bread", 30.0f, null, Category.FOOD, new Date(2020, 3, 3), (short) 3);
        System.out.println(Array[0].equals(Array[2]));
        System.out.println(Array[0].equals(a));

        GenericItem itemsAnalog = new FoodItem(6, "Oreo", 45.0f, null, Category.FOOD, new Date(2020, 4, 12), (short) 14);
        GenericItem itemThatWillBeCloned = new FoodItem(5, "Cookie", 30.0f, itemsAnalog, Category.FOOD, new Date(2020, 4, 3), (short)14);

        GenericItem itemClone = (GenericItem) itemThatWillBeCloned.clone();
        itemClone.printAll();
    }
}

